import java.util.List;

public class LevelOrder {
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
//    public List<List<Integer>> levelOrder(TreeNode root) {
//
//    }

    public void main(String[] args) {
        TreeNode root = new TreeNode(10);

        // Left and Right children
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        // Adding more nodes
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
    }
}

