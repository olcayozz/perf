package telco;

import java.util.ArrayList;

/**
 * Created on 10.4.2017.
 */
public class Node {
    public Node(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    private String label;

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    public void gez() {
        this.visited = true;
    }

    private boolean visited = false;

    @Override
    public String toString() {
        return label;
    }
}
