package com.reachingskies.geeksandgeeks.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintNodesAtKDistance {

    public static void main(String [] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(20);
        treeNode.right = new TreeNode(30);
        treeNode.left.left = new TreeNode(40);
        treeNode.left.right = new TreeNode(50);
        treeNode.right.left = new TreeNode(60);
        treeNode.right.right = new TreeNode(70);

        PrintNodesAtKDistance.printNodesAtKthDistance(treeNode,2);

    }

    public static void printNodesAtKthDistance(TreeNode root,int level) {
        if(root == null)
            return;
        if(level == 0)
            System.out.print(root.val+" ");
        else {
            printNodesAtKthDistance(root.left,level-1);
            printNodesAtKthDistance(root.right, level-1);
        }
    }
}
