package DSA_Course.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class a3_Permutation {
    static void backtrack(List arr, List path, List<List<Integer>> result, int n) {
        if (path.size() == n) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!path.contains(arr.get(i))) {
                path.add(arr.get(i));
                backtrack(arr, path, result, n);
                path.remove(path.size() - 1);
            }
        }
    }
    static List<List<Integer>> permute(List<List<Integer>> arr) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, new ArrayList<>(), result, arr.size());
        return result;
    }
}
