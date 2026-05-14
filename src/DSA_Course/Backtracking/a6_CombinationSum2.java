package DSA_Course.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a6_CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

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

        for (int i = start; i < candidates.length && candidates[i] <= remaining; i++) {

            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            path.add(candidates[i]);

            // i + 1 because each element can be used only once
            backtrack(candidates,
                    remaining - candidates[i],
                    i + 1,
                    path,
                    result);

            // Backtrack
            path.remove(path.size() - 1);
        }
    }
}
