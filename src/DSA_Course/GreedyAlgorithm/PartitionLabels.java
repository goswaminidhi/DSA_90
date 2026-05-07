package DSA_Course.GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        Arrays.fill(last, -1);
        for (int i = 0; i < s.length(); i++) last[s.charAt(i) - 'a'] = i;

        List ans = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if (i == end) {
                ans.add(end - start + 1);
                start = i + 1;
            }
        }
        return ans;
    }
}
