package telco;

import jdk.nashorn.internal.objects.NativeArray;

import java.util.ArrayList;

/**
 * Created on 10.4.2017.
 */
public class Tree {
    private Nodes nodes;

    public boolean isSuccessPath() {
        return successPath;
    }

    public void setSuccessPath(boolean successPath) {
        this.successPath = successPath;
    }

    private boolean successPath = false;

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
    public Tree(Tree copy) {
        this.nodes = copy.nodes;
        this.paths = copy.paths;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "paths=" + paths.toString() +
                '}';
    }
    public Tree add (Tree tree)
    {
        Paths paths = new Paths();
        Nodes nodes = new Nodes();

        for(Path path : this.paths)
        {
            paths.add(path);
        }
        for(Path path : tree.getPaths())
        {
            paths.add(path);
        }
        this.setPaths(paths);

        for(Node node : this.nodes)
        {
            nodes.add(node);
        }
        for(Node node : tree.getNodes())
        {
            nodes.add(node);
        }
        this.setNodes(nodes);
        return this;
    }
}
