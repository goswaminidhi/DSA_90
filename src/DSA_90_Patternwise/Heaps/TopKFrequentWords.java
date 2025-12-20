package DSA_90_Patternwise.Heaps;

import java.util.*;

public class TopKFrequentWords {
    public static List<String> topKFrequent(String[] words, int k) {
        // Step 1: Count frequencies
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Step 2: Use PriorityQueue with custom comparator
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                int freqA = map.get(a);
                int freqB = map.get(b);

                if (freqA == freqB) {
                    return a.compareTo(b); // lexicographical
                }
                return freqB - freqA; // higher frequency first
            }
        });

        // Step 3: Add all words into PQ
        pq.addAll(map.keySet());

        // Step 4: Extract top K
        List<String> result = new ArrayList<>();
        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            result.add(pq.poll());
        }

        return result;
    }


    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        System.out.println(topKFrequent(words,k));
    }
}
