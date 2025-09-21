package ArrayAndString;

import java.util.*;

public class GroupAnagram {
    public static String getFrequencyString(String strs){
        int[] freq = new int[26];
        for(char c:strs.toCharArray()){
            freq[c - 'a']++;
        }
        StringBuilder freqString = new StringBuilder();
        char c = 'a';
        for(int i : freq){
            freqString.append(c);
            freqString.append(i);
            c++;
        }
        return  freqString.toString();
    }
    public static List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String freqString = getFrequencyString(strs[i]);
            if(map.containsKey(freqString)){
                map.get(freqString).add(strs[i]);
            }else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(freqString,list);
            }
        }

        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
    }
}
