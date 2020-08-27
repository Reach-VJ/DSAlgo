package com.reachingskies.geeksandgeeks.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTraverse {

    public void BFS(List<List<Integer>> adjList, int startingVertices) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[adjList.size()];

        visited[startingVertices] = true;
        queue.add(startingVertices);

        while (!queue.isEmpty()) {
            int x = queue.poll();
            System.out.print(x + " ");
            for (int i : adjList.get(x)) {
                if (visited[i] == false) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    // It will return number of disconnected graphs.
    public int BFSDisContinueGraph(List<List<Integer>> adjList) {

        int count = 0;
        boolean [] visited = new boolean[adjList.size()];

        for(int i = 0 ; i < visited.length; i++) {
            if(visited[i] == false) {
                count++;
                BFS(adjList,i,visited);
            }
        }
        return count;
    }

    public void BFS(List<List<Integer>> adjList, int i, boolean [] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        visited[i] = true;

        while(!queue.isEmpty()) {
            int x = queue.poll();
            System.out.print(x +" ");
            for(int y : adjList.get(x)) {
                if(visited[y] == false) {
                    queue.add(y);
                    visited[y] = true;
                }
            }
        }
    }
}
