package com.reachingskies.geeksandgeeks.tree;

import apple.laf.JRSUIUtils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public void inOrder(TreeNode root) {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.val +" ");
        inOrder(root.right);
    }

    public void inOrderIterative(TreeNode root) {
        if(root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(current != null || !stack.isEmpty()) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.val+" ");
            current = current.right;
        }
    }

    public void preOrder(TreeNode root) {
        if(root == null)
            return;
        System.out.print(root.val+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void preOrderIterative(TreeNode root) {
        if(root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        stack.push(current);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val+" ");
            if(node.right != null)
                stack.push(node.right);
            if(node.left != null)
                stack.push(node.left);
        }
    }

    public void preOrderIterativeSpaceOptimized(TreeNode root) {
        if(root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(current != null || !stack.isEmpty()) {
            while(current != null) {
                System.out.print(current.val+" ");
                if(current.right != null)
                    stack.push(current.right);
                current = current.left;
            }
            if(!stack.isEmpty())
                current = stack.pop();
        }
    }

    public void postOrder(TreeNode root) {
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }

    public int treeSize(TreeNode root) {
        return treeSize(root,0);
    }

    public int treeSize(TreeNode root,int size) {
        if(root == null)
            return size;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        size++;

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val+" ");
            if(node.left != null) {
                queue.add(node.left);
                size++;
            }
            if(node.right != null) {
                queue.add(node.right);
                size++;
            }
        }
        return size;
    }

    public int binaryTreeSize(TreeNode root) {
        if(root == null)
            return 0;
        else
            return 1+binaryTreeSize(root.left)+binaryTreeSize(root.right);
    }
}
