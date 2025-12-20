package DSA_90_Patternwise.Tree;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
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

  public void fill(TreeNode root, int sum,List<List<Integer>> result,List<Integer> list,int targetSum){
      if(root == null){
          return ;
      }
      sum = sum+root.val;
      list.add(root.val);

      if(root.left == null && root.right == null && sum == targetSum){
          result.add(new ArrayList<>(list));
      }
      fill(root.left,sum,result,list,targetSum);
      fill(root.right,sum,result,list,targetSum);

      list.remove(list.size() -1);

  }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        fill(root,0,result,list,targetSum);
        return result;
    }
}
