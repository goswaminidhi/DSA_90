package DSA_Course.Tree;

public class CountGoodNodes {
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

    int ans = 0;
    public int goodNodes(TreeNode root) {
        return traversal(root,Integer.MIN_VALUE);
    }
    public int traversal(TreeNode curr,int maxSeenSoFar){

        if(curr.val >= maxSeenSoFar){
            ++ans;
        }
        int currMax = Math.max(curr.val,maxSeenSoFar);
        if(curr.left != null){
            traversal(curr.left,currMax);
        }if(curr.right != null){
            traversal(curr.right,currMax);
        }
        return ans;
    }
}
