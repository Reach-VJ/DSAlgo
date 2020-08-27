package com.reachingskies.geeksandgeeks.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OneViewNodes {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        OneViewNodes.oneSideView(root);
    }

    public static void oneSideView(TreeNode root) {
        List<TreeNode> list = new LinkedList<>();
        int level = 0;
        oneView(root,list,level);
        list.stream().forEach(node -> System.out.print(node.val+" "));
    }

    public static void oneView(TreeNode root,List<TreeNode> list, int level) {
        if (root == null)
            return;
        if(level == list.size()) {
            list.add(root);
        }

        if(root.right != null) {
            oneView(root.right,list,level+1);
        }
        if(root.left != null) {
            oneView(root.left, list,level+1);
        }
    }
}
