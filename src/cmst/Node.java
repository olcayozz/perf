package cmst;

/**
 * Created on 31.3.2017.
 */
public class Node implements costable{

    public Node(String label, int cost) {
        this.label = label;
        this.cost = cost;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    private String label = "";
    private int cost = 0;

    public Node() { }

    public Node(int cost) { this.cost = cost; }

    @Override
    public int getCost() { return this.cost; }

}
