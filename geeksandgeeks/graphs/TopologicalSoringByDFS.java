package com.reachingskies.geeksandgeeks.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSoringByDFS {

    Stack<Integer> stack = new Stack<Integer>();

    public static void main(String [] args) {

        TopologicalSoringByDFS dfsSorting = new TopologicalSoringByDFS();
        List<List<Integer>>  adjList = dfsSorting.createAdjList(5);
        dfsSorting.DFSSorting(adjList);
    }

    void DFSSorting(List<List<Integer>> adjList) {
        boolean [] visited = new boolean[adjList.size()];

        for(int i = 0; i < adjList.size(); i++) {
            if(visited[i] == false)
                DFS(adjList,i,visited);
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }

    void DFS(List<List<Integer>> adjList, int vertex,boolean [] visited) {
        visited[vertex] = true;
        for(int i : adjList.get(vertex)) {
            if(visited[i] == false)
                DFS(adjList,i,visited);
        }
        stack.push(vertex);
    }

    void addEdgeForDirectionalGraph(List<List<Integer>> adjList, int x, int y) {
        adjList.get(x).add(y);
    }

    List<List<Integer>> createAdjList(int noOfVertices) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < noOfVertices; i++) {
            adjList.add(new ArrayList<>());
        }
        addEdgeForDirectionalGraph(adjList,0,1);
        addEdgeForDirectionalGraph(adjList,1,3);
        addEdgeForDirectionalGraph(adjList,3,4);
        addEdgeForDirectionalGraph(adjList,2,3);
        addEdgeForDirectionalGraph(adjList,2,4);

        return adjList;
    }
}
