package DSA_Course.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {
     class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;

         TreeNode() {
         }

         TreeNode(int val) {
             this.val = val;
         }

         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
     //Approach 1 - Recursion
    public void traversal(TreeNode curr,List<Integer> list){

        if(curr == null){
            return;
        }
        list.add(curr.val);
        traversal(curr.left,list);
        traversal(curr.right,list);

    }
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
         traversal(root,list);
         return list;
    }
    //Approach 1 - Iterative
    public List<Integer> preorderTraversal2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        stack.push(root);
        while (stack.size() >= 0){
            TreeNode curr = stack.pop();
            list.add(curr.val);
            if(curr.right != null) {
                stack.push(curr.right);
            }
            if(curr.left != null) {
                stack.push(curr.left);
            }
        }
        return list;
    }
}
