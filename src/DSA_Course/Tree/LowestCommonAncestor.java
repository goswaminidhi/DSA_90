package DSA_Course.Tree;

public class LowestCommonAncestor {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
  TreeNode lca = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case
        if (root == null || root == p || root == q) {
            return root;
        }

        // Search in left and right subtree
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both sides are non-null → LCA found
        if (left != null && right != null) {
            return root;
        }

        // Return non-null side
        return (left != null) ? left : right;

    }

}
