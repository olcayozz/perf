package telco;

/**
 * Created on 11.4.2017.
 */
public class dfs {
    public static Tree ara(Tree tree, Node startNode, Node endNode)
    {
        Tree tmpTree = new Tree();
        Tree calcTree = new Tree();

        tree.getNodes().get(startNode.getLabel()).gez();

        for(Path path : tree.getPaths() ) {
            if(path.getStartNode().equals(startNode)){
                //Bu path ve Node'u gezdik.
                calcTree.getPaths().add(path);
                calcTree.getNodes().add(startNode);

                if(path.getEndNode().equals(endNode)){
                    System.out.println("Buldum.");
                    return calcTree;
                } else
                {
                    ara(tree, path.getEndNode(), endNode); //dikey ilerlemeye devam et.
                }
            }else {
                System.out.println("Bulamadim");
            }
        }
        return calcTree;
    }
}
