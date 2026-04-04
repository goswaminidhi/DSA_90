package DSA_Course.Tree;

import DSA_90_Patternwise.Learn;

public class DiameterOfBinaryTree {
    public class TreeNode {
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
    int maxDiameter = 0;
    public int diameter(TreeNode curr){
        if(curr == null){
            return 0;
        }
        int leftDiameter = diameter(curr.left);
        int rightDiameter = diameter(curr.right);
        int currDiameter = leftDiameter+rightDiameter;
        maxDiameter = Math.max(maxDiameter,currDiameter);
        return 1 + Math.max(leftDiameter,rightDiameter);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return maxDiameter;
    }
}
