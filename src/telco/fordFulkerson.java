package telco;


/**
 * Created on 10.4.2017.
 */
public class fordFulkerson {
    public static void main(String[] args) {
        System.out.println("fordFulkerson..Starts..");
        Tree tree = Utitilites.initializeTree();
        Tree calcTree = dfs.ara(tree,tree.getNodes().get("S"),tree.getNodes().get("T"));

    }
}
