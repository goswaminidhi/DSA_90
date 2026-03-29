package DSA_Course.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    //Approach 1 - Recursion
    public void traversal(TreeNode curr , List<Integer> list){
        if(curr == null){
            return;
        }
        traversal(curr.left,list);
        traversal(curr.right,list);
        list.add(curr.val);
    }
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root,list);
        return list;
    }
    //Approach 2 - Iteration(Two Stack)
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        if (root == null) {
            return list;
        }
        stack1.push(root);

        while ( !stack1.isEmpty()){
            TreeNode curr = stack1.pop();
            stack2.push(curr);
            if(curr.left != null) {
                stack1.push(curr.left);
            }
            if(curr.right != null) {
                stack1.push(curr.right);
            }
        }
        while (!stack2.isEmpty()){
            TreeNode value = stack2.pop();
            list.add(value.val);
        }
        return list;
    }
    //Approach 3 - Iteration(One Stack)
    public List<Integer> postorderTraversal3(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        TreeNode lastVisited = null;
       
        while (curr != null || !stack.isEmpty()){
            while (curr!= null ){
                stack.push(curr);
                curr = curr.left;
            }
            TreeNode peekNode = stack.peek();
            if(peekNode.right != null && lastVisited != peekNode.right){
               curr =  peekNode.right;
            }else{
                list.add(peekNode.val);
                lastVisited = stack.pop();
            }
        }
        return list;
    }
}
