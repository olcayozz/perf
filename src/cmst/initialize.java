package cmst;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.ArrayList;

/**
 * Created on 1.4.2017.
 */
public class initialize {
    public static ArrayList<Node> initializeNodes() {
        ArrayList<Node> nodes = new ArrayList<Node>();
        nodes.add(new Node("A", 1));
        nodes.add(new Node("B", 1));
        nodes.add(new Node("C", 1));
        nodes.add(new Node("D", 2));
        nodes.add(new Node("E", 1));
        nodes.add(new Node("F", 1));
        nodes.add(new Node("G", 1));
        return nodes;
    }

    public static ArrayList<Path> initializePaths() {
        ArrayList<Path> paths = new ArrayList<Path>();
        paths.add(new Path("A", "B", 3));
        paths.add(new Path("A", "C", 3));
        paths.add(new Path("A", "D", 3));
        paths.add(new Path("A", "B", 3));
        paths.add(new Path("A", "F", 3));
        paths.add(new Path("A", "G", 3));
        paths.add(new Path("B", "C", 3));
        paths.add(new Path("B", "D", 3));
        paths.add(new Path("B", "E", 3));
        paths.add(new Path("B", "F", 3));
        paths.add(new Path("B", "G", 3));
        paths.add(new Path("C", "D", 3));
        paths.add(new Path("C", "E", 3));
        paths.add(new Path("C", "F", 3));
        paths.add(new Path("C", "G", 3));
        paths.add(new Path("D", "E", 3));
        paths.add(new Path("D", "F", 3));
        paths.add(new Path("D", "G", 3));
        paths.add(new Path("E", "F", 3));
        paths.add(new Path("E", "G", 3));
        paths.add(new Path("F", "G", 3));
        return paths;
    }
}