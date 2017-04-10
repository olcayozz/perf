package telco;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created on 10.4.2017.
 */
public class Utitilites {
    public static Nodes Nodes;
    public static Paths Paths;
    public static void initializeNodes(){
        Nodes nodes = new Nodes();
        nodes.add(new Node("S"));
        nodes.add(new Node("A"));
        nodes.add(new Node("B"));
        nodes.add(new Node("C"));
        nodes.add(new Node("D"));
        nodes.add(new Node("T"));
        Nodes = nodes;
    }
    public static void initializePaths(){
        Paths paths = new Paths();
        paths.add(new Path(Nodes.get("S"),Nodes.get("A"),10));
        paths.add(new Path(Nodes.get("S"),Nodes.get("C"),10));
        paths.add(new Path(Nodes.get("A"),Nodes.get("B"),4));
        paths.add(new Path(Nodes.get("A"),Nodes.get("D"),8));
        paths.add(new Path(Nodes.get("A"),Nodes.get("C"),2));
        paths.add(new Path(Nodes.get("B"),Nodes.get("T"),10));
        paths.add(new Path(Nodes.get("C"),Nodes.get("D"),9));
        paths.add(new Path(Nodes.get("D"),Nodes.get("T"),10));
        Paths=paths;
    }
    public static Tree initializeTree(){
        initializeNodes();
        initializePaths();
        return new Tree(Nodes,Paths);
    }
}
