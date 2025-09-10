import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> level = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();;
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode treeValue = queue.poll();
                list.add(treeValue.val);

                if (treeValue.left != null) {
                    queue.add(treeValue.left);
                }
                if (treeValue.right != null) {
                    queue.add(treeValue.right);
                }
            }
            level.add(list);
        }


        return level;
    }
}

