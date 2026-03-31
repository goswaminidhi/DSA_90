package DSA_Course.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
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
    public boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        return left.val == right.val &&
                isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }
    public boolean isSymmetric1(TreeNode root) {
        return isMirror(root.left,root.right);
    }
    public boolean isSymmetric2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root.left != null)queue.offer(root.left);
        if(root.right != null)queue.offer(root.right);
        while (!queue.isEmpty()){
            TreeNode p1 = queue.poll();
            TreeNode p2 = queue.poll();
            if(p1 == null && p2 == null){
                continue;
            }
            if(p1 == null || p2 == null){
                return false;
            }
            if(p1.val != p2.val){
                return false;
            }
            queue.offer(p1.left);
            queue.offer(p2.right);
            queue.offer(p1.right);
            queue.offer(p2.left);
        }
        return true;
    }
}
