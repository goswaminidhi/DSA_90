import java.util.LinkedList;
import java.util.Queue;

public class PathSum {
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
       if(root == null){
           return false;
       }
       if(root.right == null && root.left == null){
          return targetSum - root.val == 0;
       }
       targetSum -= root.val;
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
    }
}
