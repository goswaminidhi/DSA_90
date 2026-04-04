package DSA_Course.Tree;

public class BalancedBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    boolean ans = true;
    public boolean isBalanced(TreeNode root) {
        calculateHeight(root);
        return ans;
    }
    public int calculateHeight(TreeNode curr){
        if(curr == null){
            return 0;
        }

        int leftHeight = calculateHeight(curr.left);
        int rightHeight = calculateHeight(curr.right);

        if(Math.abs(leftHeight - rightHeight )> 1){
            ans = ans && false;
        }
        return   1 + Math.max(leftHeight,rightHeight);

    }
}
