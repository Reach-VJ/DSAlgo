package com.reachingskies.geeksandgeeks.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintLeftOrRightVeiwOfBinaryTree {

    public static void main(String [] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(20);
        treeNode.right = new TreeNode(30);
        treeNode.left.left = new TreeNode(40);
        treeNode.left.right = new TreeNode(50);
        treeNode.right.left = new TreeNode(60);
        treeNode.right.right = new TreeNode(70);

        PrintLeftOrRightVeiwOfBinaryTree.printLeftOrRight(treeNode);
    }


    public static void printView(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        printView(root,list,0);
        list.stream().forEach(treeNode -> System.out.print(treeNode.val+" "));
    }

    public static void printView(TreeNode root, List<TreeNode> list, int level) {
        if(root == null)
            return;
        if(level == list.size())
            list.add(root);
        if(root.right != null) {
            printView(root.right,list,level+1);
        }
        if(level != list.size()) {
            printView(root.left,list,level+1);
        }
    }

    // Different approach

    public static void printLeftOrRight(TreeNode root) {
        if(root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int count = queue.size();
            for(int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                if(i == 0)
                    System.out.print(node.val+" ");
                if(node.right != null) queue.add(node.right);
                if(node.left != null) queue.add(node.left);
            }
        }
    }
}
