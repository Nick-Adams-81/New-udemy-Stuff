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
        graph.addEdge("B", "C");
        graph.printGraph();

        graph.removeEdge("A", "C");
        graph.printGraph();

        graph.removeVertex("C");
        graph.printGraph();

    }
}
