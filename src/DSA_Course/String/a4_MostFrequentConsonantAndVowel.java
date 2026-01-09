package DSA_Course.String;

import java.util.HashMap;

public class a4_MostFrequentConsonantAndVowel {
    //Approach 1 -> Using HashMap
    public static int maxFreqSum1(String s) {
        int vowelFreq = 0;
        int consonantFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Character key : map.keySet()) {
            if (key == 'a' || key == 'e' ||key == 'i' || key == 'o' || key == 'u') {
                vowelFreq = Math.max(vowelFreq, map.get(key));
            }else {
                consonantFreq = Math.max(consonantFreq, map.get(key));
            }
        }
        System.out.println(map);
        return vowelFreq + consonantFreq;
    }

    //Approach 2 -> Character Frequency
    public static int maxFreqSum2(String s) {
        int[] vowels = new int[26];
        int[] consonant = new int[26];

        for (char ch:s.toCharArray()) {
            if(ch == 'a' || ch == 'e' ||ch == 'i'||ch == 'o'||ch == 'u' ){
                vowels[ch - 'a']++;
            }else{
                consonant[ch - 'a']++;
            }
        }
        int vowelFreq = 0;
        int consonantFreq = 0;
        for (char c:s.toCharArray()){
            if(vowels[c-'a']>vowelFreq){
                vowelFreq = Math.max(vowelFreq,vowels[c-'a']);
            }
        }
        for (char c:s.toCharArray()){
            if(consonant[c-'a']>consonantFreq){
                consonantFreq = Math.max(consonantFreq,consonant[c-'a']);
            }
        }
        return consonantFreq+vowelFreq;
    }

    public static void main(String[] args) {
        String s = "successes";
        System.out.println(maxFreqSum1(s));
        System.out.println(maxFreqSum1("aeiaeia"));
        System.out.println(maxFreqSum2(s));
        System.out.println(maxFreqSum2("aeiaeia"));
    }
}
