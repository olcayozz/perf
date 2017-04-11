package telco;

/**
 * Created on 11.4.2017. Tum node'ların birbirine bagli oldugu dolayısıyla Start/End arasında en az bir tane yol bulanacagı kurgusu üzerine çalışır.(end node'un baska bir tree'nin startNode'u oldugunu kabul eder. (Geri donus yok)
 */
public class dfs {
    public static Tree ara(Tree tree, Node startNode, Node endNode)
    {
        Tree tmpTree = new Tree();
        Paths calcPaths = new Paths();

        Nodes calcNodes = new Nodes();

        for(Path path : tree.getPaths() )  {
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
