package DSA_Course.Tree;

public class SubTreeOfAnotherTree {
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String hasRoot = serilize(root);
        String hasSubRoot = serilize(subRoot);
        return hasRoot.contains(hasSubRoot);

    }
    public String serilize(TreeNode curr){
        StringBuilder hash = new StringBuilder();
        serializeHelper(curr,hash);
        return hash.toString();
    }
    public void serializeHelper(TreeNode node, StringBuilder hash){
        if(node == null){
            hash.append("-#");
            return;
        }
        hash.append("-").append(node.val);
        serializeHelper(node.left, hash);
        serializeHelper(node.right, hash);
    }
}
