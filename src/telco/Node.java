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

    @Override
    public String toString() {
        return label;
    }
}
