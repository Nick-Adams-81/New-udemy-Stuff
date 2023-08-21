package Graphs;

public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.printGraph();

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.printGraph();
    }
}
