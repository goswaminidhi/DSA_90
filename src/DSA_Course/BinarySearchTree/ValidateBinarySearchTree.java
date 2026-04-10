package DSA_Course.BinarySearchTree;

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
    public boolean valid(TreeNode node){
        boolean ans = false;
        return isBst(node,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isBst(TreeNode curr , long min,long max){
        if(curr == null){
            return true;
        }
        if(curr.val <= min || curr.val >= max){
            return false;
        }
        boolean leftBst = isBst(curr.left,min, curr.val);
        boolean rightBst = isBst(curr.right,curr.val,max);
        return leftBst && rightBst;
    }
}
