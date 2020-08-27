package com.reachingskies.geeksandgeeks.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SortingByBFSKohnsAlgo {

    public static void main(String [] args) {

        SortingByBFSKohnsAlgo algo = new SortingByBFSKohnsAlgo();
        List<List<Integer>> adjList = algo.createAdjList(5);
        int [] inDegrees = algo.getDegrees(adjList)[0];
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < inDegrees.length; i++) {
            if(inDegrees[i] == 0) {
                queue.add(i);
            }
        }

        while(!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex+" ");
            for(int i : adjList.get(vertex)) {
                inDegrees[i]--;
                if(inDegrees[i] == 0)
                    queue.add(i);
            }
        }
    }

    List<List<Integer>> createAdjList(int numberOfVertices) {
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0; i < numberOfVertices; i++) {
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList,0,2);
        addEdge(adjList,0,3);
        addEdge(adjList, 2,3);
        addEdge(adjList, 1,3);
        addEdge(adjList, 1,4);

        return adjList;
    }

    int [][] getDegrees(List<List<Integer>> adjList) {
        int [] inDegrees = new int[adjList.size()];
        int [] outDegrees = new int[adjList.size()];

        for(int i = 0; i < adjList.size(); i++) {
            outDegrees[i] = adjList.get(i).size();
            for(int j = 0; j < adjList.get(i).size(); j++) {
                inDegrees[adjList.get(i).get(j)]++;
            }
        }

        return new int[][]{inDegrees,outDegrees};
    }

    void addEdge(List<List<Integer>> adjList, int x, int y) {
        adjList.get(x).add(y);
    }


}
