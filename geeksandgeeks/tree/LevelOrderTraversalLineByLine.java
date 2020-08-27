package com.reachingskies.geeksandgeeks.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLineByLine {

    public static void main(String [] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(20);
        treeNode.right = new TreeNode(30);
        treeNode.left.left = new TreeNode(40);
        treeNode.left.right = new TreeNode(50);
        treeNode.right.left = new TreeNode(60);
        treeNode.right.right = new TreeNode(70);

        LevelOrderTraversalLineByLine.levelOrderTraversalLineByLine(treeNode);
    }

    public static void levelOrderTraversalLineByLine(TreeNode root) {

        if(root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int count = queue.size();
            for(int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                System.out.print(node.val+" ");
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            System.out.println();
        }
    }
}
