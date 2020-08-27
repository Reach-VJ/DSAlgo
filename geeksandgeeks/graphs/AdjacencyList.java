package com.reachingskies.geeksandgeeks.graphs;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    public static void main(String [] args) {
        int noOfVerticies = 4;
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0; i < noOfVerticies; i++) {
            adjList.add(new ArrayList<Integer>());
        }

        AdjacencyList list = new AdjacencyList();
        list.addEdge(adjList,0,1);
        list.addEdge(adjList,0,2);
        list.addEdge(adjList,1,2);
        list.addEdge(adjList,1,3);

        list.printGraph(adjList);

        BFSTraverse traverse = new BFSTraverse();
        DFSTraverse traverseDFS = new DFSTraverse();
        System.out.println("\nNumber of Islands : "+traverseDFS.DFSGraph(adjList));
        traverse.BFS(adjList,0);

        int numberOflands = traverse.BFSDisContinueGraph(adjList);

        System.out.println("Number of I lands : "+numberOflands);

        //Detect Cycle in Undirected Graph

        DetectCycleUndirectedGraph detectCycle = new DetectCycleUndirectedGraph();
        boolean cycleDetected = detectCycle.detectCycleDFS(adjList);
        System.out.println("Cycle detected in Graph : "+cycleDetected);

    }

    void addEdge(List<List<Integer>> adjList, int x, int y) {
        adjList.get(x).add(y);
        adjList.get(y).add(x);
    }

    void printGraph(List<List<Integer>> adjList) {
        for(int i = 0; i < adjList.size(); i++) {
            System.out.print(i+" --> ");
            for(int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(" "+adjList.get(i).get(j)+" ");
            }
            System.out.println("");
        }
    }
}



