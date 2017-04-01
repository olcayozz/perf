package cmst;

/**
 * Created on 31.3.2017.
 */
public class Path implements costable {
    private String startNode ="";
    private String endNode ="";
    private int cost = 0;

    public Path() {  }

    public Path(int cost) { this.cost = cost; }

    public Path(String startNode, String endNode, int cost) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.cost = cost;
    }

    @Override
    public int getCost() { return 0; }

    public String getStartNode() {
        return startNode;
    }

    public void setStartNode(String startNode) {
        this.startNode = startNode;
    }

    public String getEndNode() {
        return endNode;
    }

    public void setEndNode(String endNode) {
        this.endNode = endNode;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
