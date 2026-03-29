package DSA_Course.Tree;

public class MaximumDepthOfTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    //Approach1 -> Top Down
    int maxDepth = 0;
    public void traverse(TreeNode curr,int depth){
        maxDepth = Math.max(depth,maxDepth);
        if(curr.left != null){
            traverse(curr.left,depth+1);
        }
        if(curr.right != null){
            traverse(curr.right,depth+1);
        }
    }
    public int maxDepth1(TreeNode root) {
        if(root == null){
            return 0;
        }
        traverse(root,1);
        return maxDepth;
    }
    //Approach 2 -> Bottom Up
    public int maxDepth2(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDepth = maxDepth2(root.left);
        int rightDepth = maxDepth2(root.right);
        return 1 + Math.max(leftDepth,rightDepth);
    }


}
