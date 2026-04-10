package DSA_Course.BinarySearchTree;

public class KthSmallestElementInBST {
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
    int count = 0;
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
         count = k;
        traversal(root);
        return ans;

    }
    public void traversal(TreeNode curr ){
        if(curr == null || count == 0) return ;
        if(curr.left != null) traversal(curr.left);
        count--;
        if(count == 0) ans =  curr.val;
        if(curr.right != null) traversal(curr.right);
    }

    public static void main(String[] args) {

    }
}
