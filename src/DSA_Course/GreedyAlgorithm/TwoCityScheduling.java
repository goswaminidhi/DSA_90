package DSA_Course.GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
//        Arrays.sort(costs, new Comparator() {
//            public int compare(int[] a, int[] b) {
//                // sort descending by (cost[1] - cost[0])
//                return (b[1] - b[0]) - (a[1] - a[0]);
//            }
//        });
        Arrays.sort(costs, (a, b) ->
                Integer.compare((b[1] - b[0]), (a[1] - a[0]))
        );
        int n = costs.length / 2;
        int ans = 0;
        for (int i = 0; i < n; i++) ans += costs[i][0];
        for (int i = n; i < costs.length; i++) ans += costs[i][1];
        return ans;
    }
}
