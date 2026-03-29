package DSA_Course.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
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

  //Approach 1 -> Iteration
    public List<List<Integer>> levelOrder1(TreeNode root) {
//        List<List<Integer>> ans = new ArrayList<>();
//        if (root == null) return ans;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            int levelSize = queue.size();
//            List<Integer> levelList = new ArrayList<>();
//            for (int i = 0; i < levelSize; i++) {
//                TreeNode node = queue.poll();
//                levelList.add(node.val);
//
//                if (node.left != null) {
//                    queue.offer(node.left);
//                }
//                if (node.right != null) {
//                    queue.offer(node.right);
//                }
//
//
//            }
//            ans.add(levelList);
//        }
//        return ans;
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return list;
        queue.offer(root);
        while(!queue.isEmpty()){
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
            list.add(levelList);
        }
        return list;
    }
    public List<List<Integer>> traversal(TreeNode node,int level,List<List<Integer>> list){

        if(node == null){
            return list;
        }
        if (list.size() == level) {
            list.add(new ArrayList<>());
        }
        list.get(level).add(node.val);
        if(node.left != null) {
            traversal(node.left, level + 1,list);
        }if(node.right != null) {
            traversal(node.right, level + 1,list);
        }
        return list;
    }
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        return traversal(root,0,list);
    }
}
