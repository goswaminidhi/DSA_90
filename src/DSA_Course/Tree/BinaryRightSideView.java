package DSA_Course.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryRightSideView {
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return list;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> levelList = new ArrayList<>();
            int listSize = queue.size();

            for (int i = 0; i < listSize; i++) {
                TreeNode curr = queue.poll();
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
                levelList.add(curr.val);
            }
            list.add(levelList.removeLast());

        }
        return list;
    }

}
