package telco;

/**
 * Created on 11.4.2017.
 */
public class dfs {
    public static Tree ara(Tree tree, Node startNode, Node endNode)
    {
        Tree tmpTree = new Tree();
        Paths calcPaths = new Paths();
        Nodes calcNodes = new Nodes();

        label: for(Path path : tree.getPaths() )  {
            if(path.getStartNode().equals(startNode)){
                //Bu path ve Node'u gezdik.
                calcPaths.add(path);
                tmpTree.setPaths(calcPaths);
                calcNodes.add(startNode);
                tmpTree.setNodes(calcNodes);
                System.out.println("ARIYORUM : " + path.toString());
                if(path.getEndNode().equals(endNode)){
                    System.out.println("Buldum!!...");
                    return tmpTree;
                } else
                {
                    return tmpTree.add(ara(tree, path.getEndNode(), endNode)); //dikey ilerlemeye devam et.
                }
            }
        }
        return tmpTree;
    }
}
