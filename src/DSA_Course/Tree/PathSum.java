package DSA_Course.Tree;

public class PathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    boolean ans = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null){
            return false;
        }
        traverse(root,0,targetSum);
        return ans;
    }
    public void traverse(TreeNode node,int currSum,int targetSum){
        int newSum = currSum+node.val;
        if(node.left == null && node.right == null){
            if(newSum == targetSum){
                ans = true;
            }
        }
        if(node.left != null){
            traverse(node.left,newSum,targetSum);
        }
        if(node.right != null){
            traverse(node.right,newSum,targetSum);
        }
    }
}
