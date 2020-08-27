package com.reachingskies.geeksandgeeks.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxInBinaryTree {

    public static void main(String [] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(20);
        treeNode.right = new TreeNode(80);
        treeNode.left.left = new TreeNode(40);
        treeNode.left.right = new TreeNode(50);
        int maxRec = MaxInBinaryTree.maxInBinaryTreeRec(treeNode);
        int maxIte = MaxInBinaryTree.maxInBinaryTreeIterative(treeNode);
        System.out.println(maxIte+" "+maxRec);
    }

    //Recursice
    public static int maxInBinaryTreeRec(TreeNode root) {
        if(root == null)
            return Integer.MIN_VALUE;

        return Integer.max(root.val,
                Integer.max(maxInBinaryTreeRec(root.left),maxInBinaryTreeRec(root.right)));
    }

    public static int maxInBinaryTreeIterative(TreeNode root) {
        if(root == null)
            return Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            maxValue = Integer.max(maxValue,node.val);
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }
        return maxValue;
    }
}
