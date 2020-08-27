package target150.one111To120;


//         5
//        / \
//        4   8
//        /   / \
//        11  13  4
//        /  \      \
//        7    2      1
public class PathSum {

    public static void main(String [] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(4);
        treeNode.right = new TreeNode(8);

        treeNode.left.left = new TreeNode(11);
        treeNode.left.left.left = new TreeNode(7);
        treeNode.left.left.right = new TreeNode(2);

        treeNode.right.left = new TreeNode(13);
        treeNode.right.right = new TreeNode(4);
        treeNode.right.right.right = new TreeNode(1);

        int sum = 220;

        PathSum pathSum = new PathSum();
        boolean findPath = pathSum.hasPathsum(treeNode,sum);

        System.out.println("Find Path : "+findPath);

    }

    boolean hasPathsum(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(root.left == null && root.right == null)
            return sum == root.val;
        return hasPathsum(root.left, sum - root.val) || hasPathsum(root.right, sum - root.val);
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
        this.right = right;
    }
}
