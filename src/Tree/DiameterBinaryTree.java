package Tree;

public class DiameterBinaryTree {
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
  public int diameter(TreeNode node){
      if(node == null){
          return 0;
      }
      int rh = diameter(node.right);
      int lh = diameter(node.left);
      ans = Math.max(ans,lh+rh);

      return 1+Math.max(lh,rh);

  }
    public int diameterOfBinaryTree(TreeNode root) {
      diameter(root);
       return ans;
    }
}
