package com.reachingskies.geeksandgeeks.graphs;

import java.util.ArrayList;
import java.util.List;

public class DetectCycleUndirectedGraph {

    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        DetectCycleUndirectedGraph.addEdge(adjList, 0, 1);
        DetectCycleUndirectedGraph.addEdge(adjList, 1, 2);
        //DetectCycleUndirectedGraph.addEdge(adjList, 1, 3);
        DetectCycleUndirectedGraph.addEdge(adjList, 2, 3);
        DetectCycleUndirectedGraph.addEdge(adjList, 2, 4);
        //DetectCycleUndirectedGraph.addEdge(adjList, 3, 4);

        DetectCycleUndirectedGraph.printAdjList(adjList);

        boolean cycleDetected = DetectCycleUndirectedGraph.detectCycleDFS(adjList);
        System.out.println("Cycle detected : "+ cycleDetected);
    }

    static void addEdge(List<List<Integer>> adjList, int x, int y) {
        adjList.get(x).add(y);
        adjList.get(y).add(x);
    }

    static void printAdjList(List<List<Integer>> adjList) {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + " --> ");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static boolean detectCycleDFS(List<List<Integer>> adjList) {
        boolean[] visited = new boolean[adjList.size()];

        for (int i = 0; i < adjList.size(); i++) {
            if (visited[i] == false) {
                if(DSFRec(adjList, i, visited,-1) == true)
                    return true;
            }
        }
        return false;
    }

    static boolean DSFRec(List<List<Integer>> adjList, int s, boolean[] visited, int parent) {
        visited[s] = true;
        for (int i : adjList.get(s)) {
            if (visited[i] == false) {
                if (DSFRec(adjList, i, visited, s) == true)
                    return true;
            }
            else if(i != parent) {
                return true;
            }
        }
        return false;
    }
}