package DSA_Course.String;

import java.util.Arrays;
import java.util.HashMap;

public class a10_ValidAnagram {
    //Approach 1
    public static boolean isAnagram1(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }

        for (int i = 0; i < t.length(); i++) {
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }

        if(map1.equals(map2)){
            return true;
        }

        return false;
    }
    //Approach 2 to be completed
    public static boolean isAnagram2(String s, String t) {
        char[] st = s.toCharArray();
        char[] t2 = t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(t2);
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram1("anagram","nagaram"));
        System.out.println(isAnagram1( "rat","car"));
    }
}
