package cmst;

import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by TCNOZYILMAZ on 31.3.2017.
 */
public class Tree implements costable {

    private ArrayList<Node> possibleNodes = new ArrayList<Node>();
    private ArrayList<Path> possiblePaths = new ArrayList<Path>();

    private ArrayList<Node> nodes = new ArrayList<Node>();
    private ArrayList<Path> paths = new ArrayList<Path>();

    public Tree() {
        this.possibleNodes = initialize.initializeNodes();
        this.possiblePaths = initialize.initializePaths();
    }

    public Tree(ArrayList<Node> nodes, ArrayList<Path> paths) {
        this.possibleNodes = nodes;
        this.possiblePaths = paths;
    }

    @Override
    public int getCost() {
        int totalCost=0;
        ArrayList<costable> costableObjects = new ArrayList<costable>();
        costableObjects.addAll(nodes);
        costableObjects.addAll(paths);
        for (costable obj: costableObjects ) {
            totalCost += obj.getCost();
        }
        return  totalCost;
    }

    public ArrayList<Node> getPossibleNodes() {
        return possibleNodes;
    }

    public void setPossibleNodes(ArrayList<Node> nodes) {
        this.possibleNodes = nodes;
    }

    public ArrayList<Path> getPossiblePaths() {
        return possiblePaths;
    }

    public void setPossiblePaths(ArrayList<Path> paths) {
        this.possiblePaths = paths;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public ArrayList<Path> getPaths() {
        return paths;
    }

    public void setPaths(ArrayList<Path> paths) {
        this.paths = paths;
    }
}
