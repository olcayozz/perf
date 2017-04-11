package telco;

/**
 * Created on 10.4.2017.
 */
public class Path {
    private Node startNode;
    private Node endNode;
    private int capacity = 0;
    private int flow = 0;

    public Path(Node startNode, Node endNode, int capacity, int flow) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.capacity = capacity;
        this.flow = flow;
    }

    public Path(Node startNode, Node endNode, int capacity) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.capacity = capacity;
        this.flow = flow;
    }


    public Path() {
    }

    public Path(Node startNode, Node endNode) {
        this.startNode = startNode;
        this.endNode = endNode;
    }

    public Node getStartNode() {
        return startNode;
    }

    public void setStartNode(Node startNode) {
        this.startNode = startNode;
    }

    public Node getEndNode() {
        return endNode;
    }

    public void setEndNode(Node endNode) {
        this.endNode = endNode;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

    @Override
    public String toString() {
        return "Path{" +
                "startNode=" + startNode +
                ", endNode=" + endNode +
                ", capacity=" + capacity +
                ", flow=" + flow +
                '}';
    }
}
