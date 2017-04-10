package telco;

import static telco.fordFulkerson.ara;

/**
 * Created on 10.4.2017.
 */
public class fordFulkerson {
    public static void main(String[] args) {
        System.out.println("fordFulkerson..Starts..");
        Tree tree = Utitilites.initializeTree();
        tree.getNodes().get("S").gez();
        Tree foundWay = ara(tree,tree.getNodes().get("S"),tree.getNodes().get("T"));

    }
    public static Tree ara(Tree tree, Node start, Node end)
    {
        Tree tmpTree= new Tree();
        System.out.println("ara..1..");
        for (Path paths: tree.getPaths()) {
            System.out.println("ara..2..");
            if(paths.getStartNode().equals(start))
            {
                System.out.println("ara..3..");
                if(paths.getEndNode().equals(end))
                    return tmpTree;
            }else {
                System.out.println("ara..4..");
                tmpTree.getPaths().add(paths);
                tmpTree.getNodes().add(paths.getEndNode());
                //Tree treeRet = ara(tmpTree,paths.getEndNode(), end);
                //tmpTree.getPaths().addAll(treeRet.getPaths());
                //tmpTree.getNodes().addAll(treeRet.getNodes());
                return ara(tmpTree,paths.getEndNode(), end);
            }
        }
        return tmpTree;
    }
}
