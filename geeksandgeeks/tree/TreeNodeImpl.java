package com.reachingskies.geeksandgeeks.tree;

public class TreeNodeImpl {

    public static void main(String [] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(20);
        treeNode.right = new TreeNode(30);
        treeNode.left.left = new TreeNode(40);
        treeNode.left.right = new TreeNode(50);
        System.out.print("In Order recursive --> ");
        treeNode.inOrder(treeNode);
        System.out.print("\nIn Order iterative --> ");
        treeNode.inOrderIterative(treeNode);
        System.out.print("\nPre Order --> ");
        treeNode.preOrder(treeNode);
        System.out.print("\nPre Order Iterative --> ");
        treeNode.preOrderIterative(treeNode);
        System.out.print("\nPost Order --> ");
        treeNode.postOrder(treeNode);
        System.out.print("\nLevel Order --> ");
        int size = treeNode.treeSize(treeNode);
        System.out.println("\nTree size --> "+size);
        System.out.println("\nBinary Tree size --> "+treeNode.binaryTreeSize(treeNode));
    }
}
