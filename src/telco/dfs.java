package telco;

/**
 * Created on 11.4.2017.
 */
public class dfs {
    public static Tree ara(Tree tree, Node startNode, Node endNode)
    {
        Tree tmpTree = tree;
        Tree calcTree = new Tree();

        for(Path path : tree.getPaths() ) {
            if(path.getStartNode().equals(startNode)){
                //Bu path ve Node'u gezdik.
                tmpTree.getPaths().remove(path);
                tmpTree.getNodes().remove(startNode);
                System.out.println("ARIYORUM : " + path.toString());
                if(path.getEndNode().equals(endNode)){
                    System.out.println("Buldum!!...");
                    tmpTree.setSuccessPath(true);
                    return tmpTree;
                } else
                {
                    ara(tmpTree, path.getEndNode(), endNode); //dikey ilerlemeye devam et.
                }
            }else {
                System.out.println("Bulamadim   = > " + path.toString());
                calcTree.setSuccessPath(false);
            }
        }

        return tmpTree;
    }
}
