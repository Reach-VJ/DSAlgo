package com.reachingskies.geeksandgeeks.graphs;

import java.util.List;

public class DFSTraverse {

    public int DFSGraph(List<List<Integer>> adjList) {
        int count = 0;
        boolean [] visited = new boolean[adjList.size()];
        for(int i = 0; i < adjList.size(); i++) {
            if(visited[i] == false) {
                DFSRec(adjList,i,visited);
                count++;
            }
        }
        return count;
    }

    void DFSRec(List<List<Integer>> adjList,int i, boolean [] visited) {
        visited[i] = true;
        System.out.print(" "+i+" ");
        for(int p : adjList.get(i)) {
            if (visited[p] == false) {
                DFSRec(adjList, p, visited);
            }
        }
    }
}
