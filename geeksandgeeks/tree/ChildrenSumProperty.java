package com.reachingskies.geeksandgeeks.tree;

public class ChildrenSumProperty {

    public static void main(String [] args) {
        TreeNode treeNode = new TreeNode(50);
        treeNode.left = new TreeNode(20);
        treeNode.right = new TreeNode(30);
        treeNode.left.left = new TreeNode(10);
        treeNode.left.right = new TreeNode(10);
        boolean isChildSum = ChildrenSumProperty.isChildrenSum(treeNode);
        System.out.println("Is child sum --> "+ isChildSum);
    }

    public static boolean isChildrenSum(TreeNode root) {
        if(root == null)
            return true;
        if(root.left == null && root.right == null) {
            return true;
        }
        int sum = 0;
        if(root.left != null) {
            sum += root.left.val;
        }
        if(root.right != null) {
            sum += root.right.val;
        }
        return (root.val == sum && isChildrenSum(root.left) && isChildrenSum(root.right));
    }
}
