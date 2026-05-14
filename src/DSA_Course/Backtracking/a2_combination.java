package DSA_Course.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class a2_combination {
       void backtrack(int n, int k, int start, List path, List<List<Integer>> result) {
            if (path.size() == k) {
                result.add(new ArrayList<>(path));
                return;
            }
            for (int i = start; i <= n; i++) {
                path.add(i);
                backtrack(n, k, i + 1, path, result);
                path.remove(path.size() - 1);
            }
        }

         List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> result = new ArrayList<>();
            backtrack(n, k, 1, new ArrayList<>(), result);
            return result;
        }
        public  void main(String[] args) {
            List<List<Integer>> ans = combine(4, 2);
            for (List list : ans) {
                System.out.println(list);
            }
        }

}
