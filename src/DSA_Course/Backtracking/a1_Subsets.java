package DSA_Course.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class a1_Subsets {

        static void backtrack(int[] arr, List path, int start, List<List<Integer>> result) {
            result.add(new ArrayList<>(path));
            for (int i = start; i < arr.length; i++) {
                path.add(arr[i]);
                backtrack(arr, path, i + 1, result);
                path.remove(path.size() - 1);
            }
        }
        static List<List<Integer>> subsets(int[] arr) {
            List<List<Integer>> result = new ArrayList<>();
            backtrack(arr, new ArrayList<>(), 0, result);
            return result;

    }
}
