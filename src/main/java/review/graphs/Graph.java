package review.graphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<List<Vertex>> adjList = new ArrayList<>();

    public Graph(List<Edge> edges) {
        //construct adjacency list
        //create empty arraylist for each adjacency list element
        for(int i = 0; i < edges.size(); i++) {
            adjList.add(i, new ArrayList<>());
        }

        //add vertices connected to current vertex
        for(Edge edge : edges) {
            adjList.get(edge.from).add(new Vertex(edge.to, edge.weight));
        }

    }

    public static void printGraph(Graph graph) {
        int fromVertex = 0;
        System.out.println("Printing the relatioships on the graph");
        while(fromVertex < graph.adjList.size()) {
            for(Vertex v: graph.adjList.get(fromVertex)) {
                System.out.println("Vertex " + fromVertex + "==>" + v.value + " ("+v.weight+")\t");
            }
            System.out.println();
            fromVertex++;

        }
    }
}
