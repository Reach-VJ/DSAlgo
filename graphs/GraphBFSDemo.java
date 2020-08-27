package com.reachingskies.graphs;

import java.util.LinkedList;

// Creating Graph Class
class Graph {


    private int V;
    private LinkedList<Integer>[] adj;

    //Constructor with size of nodes/vertices.
    // It will create Array of Linked list based on number of nodes.

    public Graph(int v) {
        V = v;

        adj = new LinkedList[V];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    //Adding Edge info.
    public void addEdge(int v, int w) {

        adj[v].add(w);
    }


    void BFS(int s) {

        //Creating visitor array to update the visited details.
        boolean[] visited = new boolean[V];
        //Creating queue to add nodes.
        LinkedList<Integer> queue = new LinkedList<>();

        //Add starting node and make it as visited.
        queue.add(s);
        visited[s] = true;

        //Verify the queue size
        while (queue.size() != 0) {

            //Remove the node from queue, print and add
            // adjacent nodes of removed node and make it as visited.
            //Continue while loop until queue size zero.
            s = queue.poll();
            System.out.print(s + " ");
            for (Integer integer : adj[s]) {
                if (!visited[integer]) {
                    visited[integer] = true;
                    queue.add(integer);
                }
            }
        }
    }

    void DFS(int s) {
        //Creating visitor array to update the visited details.
        boolean[] visited = new boolean[V];
        //Creating queue to add nodes.
        LinkedList<Integer> stack = new LinkedList<>();

        //Adding to stack, print and making as visited
        stack.add(s);
        System.out.print(s+" ");
        visited[s] = true;

        //Verify the stack size
        while(stack.size() != 0) {
            s = stack.peekLast();
            for(Integer integer : adj[s]) {
                //Add first unvisited node to stack, if no unvisited element pop node from stack.
                if(!visited[integer]) {
                    stack.add(integer);
                    visited[integer] = true;
                    System.out.print(integer+" ");
                    break;
                } else {
                    stack.pollLast();
                }
            }
        }

    }
}

public class GraphBFSDemo {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 2);

        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

        graph.BFS(0);
    }

}

