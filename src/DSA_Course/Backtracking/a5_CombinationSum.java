package DSA_Course.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class a5_CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        backtrack(candidates, target, 0, path, result);

        return result;
    }

    private void backtrack(int[] candidates,
                           int remaining,
                           int start,
                           List<Integer> path,
                           List<List<Integer>> result) {

        // Base case
        if (remaining == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        // If target becomes negative
        if (remaining < 0) {
            return;
        }

        // Try every candidate starting from current index
        for (int i = start; i < candidates.length; i++) {
            path.add(candidates[i]);

            // it is passed again because same element can be reused
            backtrack(candidates,
                    remaining - candidates[i],
                    i,
                    path,
                    result);

            // Backtrack
            path.remove(path.size() - 1);
        }
    }
}
