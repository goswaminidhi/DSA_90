package DSA_Course.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    //Approach 1 - Recursion
    public void traversal(TreeNode curr, List<Integer> list){

        if(curr == null){
            return;
        }
        traversal(curr.left,list);
        list.add(curr.val);
        traversal(curr.right,list);

    }
    public List<Integer> InorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root,list);
        return list;
    }

    //Approach 2 - Iteration
    public List<Integer> InorderTraversal2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()){
            while (curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            if(curr != null){
                curr = curr.right;
            }
        }
        return list;
    }
}
