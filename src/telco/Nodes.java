package telco;

import java.util.ArrayList;

/**
 * Created on 10.4.2017.
 */
public class Nodes extends ArrayList<Node> {
    public Nodes() {

    }

    public Node get(String label) {
        for (Node tmpNode:this) {
            if(tmpNode.getLabel().equals(label)) { return tmpNode; }
        }
        return null;
    }
}
