package DSA_Course.Tree;

public class MaximumPathSum {
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
  int maxSumPath = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        traversal(root);
        return maxSumPath;
    }
    public int traversal(TreeNode curr){
        if(curr == null){
            return 0;
        }
        int leftSumPath = Math.max(0,traversal(curr.left));
        int rightSumPath = Math.max(0,traversal(curr.right));
        int currSum = curr.val + leftSumPath + rightSumPath;
        maxSumPath = Math.max(maxSumPath,currSum);
        return curr.val+Math.max(leftSumPath,rightSumPath);
    }
}
