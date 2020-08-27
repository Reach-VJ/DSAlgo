package com.reachingskies.geeksandgeeks.tree;

public class HeightOfBinaryTree {

    public static void main(String [] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(20);
        treeNode.right = new TreeNode(80);
        treeNode.right.left = new TreeNode(90);
        treeNode.left.left = new TreeNode(40);
        treeNode.left.left.left = new TreeNode(100);
        treeNode.left.right = new TreeNode(50);
        int height = HeightOfBinaryTree.heightOfBinaryTree(treeNode);
        System.out.println(height+" ");
    }

    public static int heightOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;

        return Integer.max(heightOfBinaryTree(root.left),heightOfBinaryTree(root.right))+1;
    }
}
