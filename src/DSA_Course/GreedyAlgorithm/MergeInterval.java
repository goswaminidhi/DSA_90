package DSA_Course.GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return new int[0][];
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List ans = new ArrayList<>();
        ans.add(new int[]{intervals[0][0], intervals[0][1]});

        for (int i = 1; i < intervals.length; i++) {
            int[] last = (int[]) ans.get(ans.size() - 1);
            if (intervals[i][0] <= last[1]) {
                last[1] = Math.max(last[1], intervals[i][1]);
            } else {
                ans.add(new int[]{intervals[i][0], intervals[i][1]});
            }
        }

        return (int[][]) ans.toArray(new int[ans.size()][]);

        //Another way may be
//
//        if (intervals == null || intervals.length == 0) {
//            return new int[0][];
//        }
//
//        // Sort intervals by starting point
//        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//
//        // Use proper generics
//        List<int[]> ans = new ArrayList<>();
//
//        ans.add(new int[]{intervals[0][0], intervals[0][1]});
//
//        for (int i = 1; i < intervals.length; i++) {
//            int[] last = ans.get(ans.size() - 1);
//
//            if (intervals[i][0] <= last[1]) {
//                // Merge overlapping intervals
//                last[1] = Math.max(last[1], intervals[i][1]);
//            } else {
//                // Add non-overlapping interval
//                ans.add(new int[]{intervals[i][0], intervals[i][1]});
//            }
//        }
//
//        return ans.toArray(new int[ans.size()][]);
    }
}
