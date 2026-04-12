package DSA_Course.String;

import java.util.*;
import java.util.stream.Collectors;

public class a12_GroupAnagram {
    public static List<List<String>> groupAnagrams1(String[] strs) {
        Map<String,List<String>> map =  new HashMap<>();
        for (String str:strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
                map.get(key).add(str);

        }
        return new ArrayList<>(map.values());
    }
    public static List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            StringBuilder key = new StringBuilder();
            for (int count : freq) {
                key.append("#").append(count);
            }

            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] st = List.of(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}).toArray(new String[0]);
        System.out.println(groupAnagrams1(st));
    }

}
