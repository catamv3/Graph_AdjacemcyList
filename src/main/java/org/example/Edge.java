package org.example;

public class Edge {
    int source;
    int destination;
    int weight;

    Edge(){
        source = 0;
        destination = 0;
        weight = 0;

    }

    Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "source=" + source +
                ", destination=" + destination +
                ", weight=" + weight +
                '}';
    }
}
