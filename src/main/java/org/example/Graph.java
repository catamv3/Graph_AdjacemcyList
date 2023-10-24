package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph {
    //list verticies
    //adjacency list (edges)


    //these are interfaces (ADT's)
    List<Integer> vertex; //list
    Map<Integer,List<Edge>> adjacencyList;  //map
    //having it as map, vs hash map allows it to

    //Int the constructor we can specialize the interface implementation

    public Graph() {

        //could be array list etc
        vertex = new LinkedList<>(); //vertex collection
        adjacencyList = new HashMap<Integer, List<Edge>>(); //create adjacency lists


    }

    public void addVertex(int v){
        vertex.add(v); //added thew new vertex

    /*    LinkedList<Edge> el = new LinkedList<>();
        adjacencyList.put(v, el);
     */
        adjacencyList.put(v, new LinkedList<>()); //added a linked list for that vertex
    }

    public void addEdge(int source, int destination, int weight){
        Edge e = new Edge(source,destination,weight);
        //get source adjacency list
        List<Edge> sourceAdjList;
        sourceAdjList = adjacencyList.get(source);
        sourceAdjList.add(e);

        List<Edge> destAdjList = adjacencyList.get(destination);
        destAdjList.add(e);
    }


}
