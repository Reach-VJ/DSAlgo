package com.reachingskies.tree;

import com.reachingskies.search.BinarySearch;

import java.util.*;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    List breadthFirstSearch() {
        Node currentNode = root;
        List<Integer> list = new ArrayList<>();
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(currentNode);
        while(!queue.isEmpty())
        {
            currentNode = queue.pollFirst();
            System.out.println(currentNode.value);
            list.add(currentNode.value);
            if(currentNode.left != null)
                queue.add(currentNode.left);
            if(currentNode.right !=null)
                queue.add(currentNode.right);
        }
        return list;
    }

//               1
//          2         3
//      4       5

//    (a) Inorder (Left, Root, Right) : 4 2 5 1 3
//    (b) Preorder (Root, Left, Right) : 1 2 4 5 3
//    (c) Postorder (Left, Right, Root) : 4 5 2 3 1

    public void depthFirstSearchPreOrder(Node root) {
        if(root == null)
            return;
        System.out.print(root.value+" ");
        depthFirstSearchPreOrder(root.left);
        depthFirstSearchPreOrder(root.right);
    }

    public void depthFirstSearchInOrder(Node root) {
        if(root == null)
            return;
        depthFirstSearchInOrder(root.left);
        System.out.print(root.value+" ");
        depthFirstSearchInOrder(root.right);
    }

    public void depthFirstSearchPostOrder(Node root) {
        if(root == null)
            return;
        depthFirstSearchPostOrder(root.left);
        depthFirstSearchPostOrder(root.right);
        System.out.print(root.value+" ");
    }

    public Node insert(int value) {
        return insertNoRec(root, value);
    }

    Node insertInRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertInRec(root.left, value);
        } else {
            root.right = insertInRec(root.right, value);
        }

        return root;
    }

    Node insertNoRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            this.root = root;
            return root;
        } else {
            Node tempNode = root;
            while (true) {
                if (value < tempNode.value) {
                    if (tempNode.left == null) {
                        tempNode.left = new Node(value);
                        return root;
                    }
                    tempNode = tempNode.left;
                } else {
                    if (tempNode.right == null) {
                        tempNode.right = new Node(value);
                        return root;
                    }
                    tempNode = tempNode.right;
                }
            }
        }
    }
}

class Node {

    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }


}
