package DSA_Course.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a4_SubsetII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, new ArrayList<>(), result, 0);

        return result;
    }

    private void backtrack(int[] arr,
                           List<Integer> path,
                           List<List<Integer>> result,
                           int start) {

        // Add current subset
        result.add(new ArrayList<>(path));

        for (int i = start; i < arr.length; i++) {

            // Skip duplicates
            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }

            // Choose
            path.add(arr[i]);

            // Explore
            backtrack(arr, path, result, i + 1);

            // Undo choice
            path.remove(path.size() - 1);
        }
    }
}
