package telco;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created on 10.4.2017.
 */
public class Utitilites {
    public static Nodes Nodes;
    public static Paths Paths;
    public void initializeNodes(){
        this.Nodes.add(new Node("S"));
        this.Nodes.add(new Node("A"));
        this.Nodes.add(new Node("B"));
        this.Nodes.add(new Node("C"));
        this.Nodes.add(new Node("D"));
        this.Nodes.add(new Node("T"));
    }
    public static void initializePaths(){
        Paths.add(new Path(Nodes.get("S"),Nodes.get("A"),10));
        Paths.add(new Path(Nodes.get("S"),Nodes.get("C"),10));
        Paths.add(new Path(Nodes.get("A"),Nodes.get("B"),4));
        Paths.add(new Path(Nodes.get("A"),Nodes.get("D"),8));
        Paths.add(new Path(Nodes.get("A"),Nodes.get("C"),2));
        Paths.add(new Path(Nodes.get("B"),Nodes.get("T"),10));
        Paths.add(new Path(Nodes.get("C"),Nodes.get("D"),9));
        Paths.add(new Path(Nodes.get("D"),Nodes.get("T"),10));
    }
    public static Tree initializeTree(){
        return new Tree(Nodes,Paths);
    }
}
