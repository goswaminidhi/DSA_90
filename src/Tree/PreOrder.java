package Tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
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
    public static void preorder(TreeNode node,List<Integer> list){
        if(node == null){
            return ;
        }
        list.add(node.val);
        preorder(node.left,list);
        preorder(node.right,list);

    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root,list);

        return list;
    }

    public void postOrder1(List<Integer> list , TreeNode node){
        if(node == null){
            return;
        }

        postOrder1(list,node.left);
        postOrder1(list,node.right);
        list.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrder1(list,root);
        return list;
    }
    public void inOrder(List<Integer> list , TreeNode node){
        if(node == null){
            return;
        }


        inOrder(list,node.left);
        list.add(node.val);
        inOrder(list,node.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(list,root);
        return list;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);

        // Left and Right children
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        // Adding more nodes
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        System.out.println(preorderTraversal(root));
    }

}
