package DSA_Course.GreedyAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] arr, int[] x) {
        int n = arr.length;
        List<int[]> ans = new ArrayList<>();
        int i = 0;

        while (i < n && arr[i][1] < x[0]) {
            ans.add(arr[i]);
            i++;
        }
        while (i < n && arr[i][0] <= x[1]) {
            x[0] = Math.min(x[0], arr[i][0]);
            x[1] = Math.max(x[1], arr[i][1]);
            i++;
        }
        ans.add(new int[]{x[0], x[1]});
        while (i < n) {
            ans.add(arr[i]);
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
