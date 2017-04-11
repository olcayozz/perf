package telco;

import perf.depth_first_search;

import java.util.ArrayList;

/**
 * Created on 11.4.2017.
 */
public class dfs {
    public static Tree ara(Tree tree, Node startNode, Node endNode)
    {
        ArrayList<perf.Path> ppf= new ArrayList<perf.Path>();
        ArrayList<String> dugumler= new ArrayList<String>();
        for (Path path : tree.getPaths())
        {
            perf.Path pp = new perf.Path(path.getCapacity(),path.getStartNode().getLabel(),path.getEndNode().getLabel(),path.getCapacity(),path.getFlow());
            ppf.add(pp);
            dugumler.add(path.getStartNode().getLabel());
            dugumler.add(path.getEndNode().getLabel());
        }


        depth_first_search.dugumler=dugumler;
        depth_first_search.yollar=ppf;

        ArrayList<String> gezilenDugumler= new ArrayList<String>();
        gezilenDugumler.add(startNode.getLabel());


        ArrayList<perf.Path> gidilenYollar = depth_first_search.ara(gezilenDugumler,endNode.getLabel());

        Paths paths = new Paths();
        for(perf.Path yol : gidilenYollar){
            paths.add(new Path(new Node((String)yol.getAnoktasi()), new Node((String)yol.getBnoktasi())));
        }

        Tree tmpTree = new Tree();
        tmpTree.setPaths(paths);
        tmpTree.setNodes(tree.getNodes());

        return tmpTree;
    }
}
