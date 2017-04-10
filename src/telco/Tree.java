package telco;

import java.util.ArrayList;

/**
 * Created on 10.4.2017.
 */
public class Tree {
    private Nodes nodes;

    public Nodes getNodes() {
        return nodes;
    }

    public void setNodes(Nodes nodes) {
        this.nodes = nodes;
    }

    public Paths getPaths() {
        return paths;
    }

    public void setPaths(Paths paths) {
        this.paths = paths;
    }

    private Paths paths;

    public Tree() {
    }

    public Tree(Nodes nodes, Paths paths) {
        this.nodes = nodes;
        this.paths = paths;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "paths=" + paths +
                '}';
    }
}
