package DSA_Course.Tree;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
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
    public void traversal(TreeNode curr , List<Integer> list){
        if(curr == null){
            return;
        }
        traversal(curr.left,list);
        traversal(curr.right,list);
        list.add(curr.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root,list);
        return list;
    }
}
