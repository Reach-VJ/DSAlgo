package target150.after150;

import apple.laf.JRSUIUtils;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeRightSideView {

    public static void main(String [] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right.right = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BinaryTreeRightSideView rightView = new BinaryTreeRightSideView();
        List<Integer> list = rightView.getRightView(root);
        System.out.println("List of right view elements --> "+ list);

    }

    List<Integer> getRightView(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        int rootLevel = 0;
        getRightViewNodes(root,list,rootLevel);
        return list;
    }

    void getRightViewNodes(TreeNode root, List<Integer> list, int level) {
        if(root == null)
            return;
        if(level == list.size())
            list.add(root.val);
        if(root.right != null)
            getRightViewNodes(root.right,list,level+1);
        if(root.left != null)
            getRightViewNodes(root.left,list,level+1);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.left = right;
    }
}
