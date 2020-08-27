package com.reachingskies.geeksandgeeks.graphs;

import java.util.*;

/**
 * Kohn's algorithm
 * * Store indegree of every vertex
 * * Create a Queue
 * * Add all 0 indegree vertices to the queue
 * * create count variable with 0
 * * while loop
 */
public class DetectCycleDirectedGraph {

    public static void main(String[] args) {
        int noOfVertices = 5;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < noOfVertices; i++) {
            adjList.add(new ArrayList<Integer>());
        }

        DetectCycleDirectedGraph directedGraph = new DetectCycleDirectedGraph();
        directedGraph.addEdgeToDirectedGraph(adjList, 0, 1);
        directedGraph.addEdgeToDirectedGraph(adjList, 1, 2);
        directedGraph.addEdgeToDirectedGraph(adjList, 2, 3);
        directedGraph.addEdgeToDirectedGraph(adjList, 3, 1);
        directedGraph.addEdgeToDirectedGraph(adjList, 4, 1);
        directedGraph.printGraph(adjList);
        int [][] degrees = directedGraph.getDegressOfGraph(adjList);
        System.out.println(Arrays.toString(degrees[0]));
        System.out.println(Arrays.toString(degrees[1]));
        boolean foundCycle = directedGraph.findCycleInDirectedGraph(adjList);
        System.out.println("Found Cycle : "+ foundCycle);
    }

    boolean findCycleInDirectedGraph(List<List<Integer>> adjList) {
        int count = 0;
        int[] inDegress = getDegressOfGraph(adjList)[0];
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < inDegress.length; i++) {
            if(inDegress[i] == 0)
                queue.add(i);
        }

        while(!queue.isEmpty()) {
            int u = queue.poll();

            for(int i : adjList.get(u)) {
                inDegress[i]--;
                if(inDegress[i] == 0)
                    queue.add(i);
            }
            count++;
        }

        return count!=adjList.size() ? true : false;
    }



    void addEdgeToDirectedGraph(List<List<Integer>> adjList, int x, int y) {
        adjList.get(x).add(y);
    }

    void printGraph(List<List<Integer>> adjList) {

        int in[] = new int[adjList.size()];
        int out[] = new int[adjList.size()];
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + " --> ");
            out[i] = adjList.get(i).size();
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(" " + adjList.get(i).get(j) + " ");
                in[adjList.get(i).get(j)]++;
            }
            System.out.println();
        }
        System.out.println("In degrees --> "+Arrays.toString(in) +" \nOut Degrees --> "+ Arrays.toString(out));
    }

    int [][] getDegressOfGraph(List<List<Integer>> adjList) {
        int [] inDegrees = new int[adjList.size()];
        int [] outDegress = new int[adjList.size()];

        for(int i = 0; i < adjList.size(); i++) {
            outDegress[i] = adjList.get(i).size();
            for(int j = 0; j < adjList.get(i).size(); j++) {
                inDegrees[adjList.get(i).get(j)]++;
            }
        }
        return new int[][]{ inDegrees,outDegress};
    }
}
