package com.graph;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class Graph {
    int V;
    LinkedList<Integer> adjListArray[];

    public Graph(int v){
        V=v;
        adjListArray=new LinkedList[V];
        for (int i=0;i<V;i++) {
            adjListArray[i]=new LinkedList<>();
        }
    }
    public void addEdge(int i, int j){
        adjListArray[i].addFirst(j);
        adjListArray[j].addFirst(i);
    }

    public void printGraph(){
        for(int v=0;v<adjListArray.length;v++){
            System.out.println("Adjacency list of vertex "+v);
            for(Integer adj: adjListArray[v]){
               System.out.print(" -> "+adj);
            }
            System.out.println();
        }
    }

    @Test
    public void graphRepresentationTest(){
        Graph graph=new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge( 1, 2);
        graph.addEdge( 1, 3);
        graph.addEdge( 1, 4);
        graph.addEdge( 2, 3);
        graph.addEdge( 3, 4);
        graph.printGraph();
    }
}
