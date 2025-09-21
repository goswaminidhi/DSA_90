package BinarySearchTree;

public class ValidateBinarySearchTree {
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
  public boolean valid(TreeNode node,long minimum,long maximum){
      if (node == null) {
          return true;
      }
      if(!(node.val > minimum && node.val < maximum)){
          return false;
      }
      return valid(node.left , minimum ,node.val) && valid(node.right,node.val,maximum);
  }
    public boolean isValidBST(TreeNode root) {
        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}
