package DSA_90_Patternwise.ArrayAndString;

import java.util.HashMap;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int left = 0;
        int right = 0;
        HashMap<Character,Integer> set = new HashMap<>();
        while(right < s.length()){
            char ch = s.charAt(right);
            if(set.containsKey(ch)){
               left = Math.max(set.get(ch)+1,left);
            }
            set.put(ch,right);
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcabcbb" ;
        System.out.println(lengthOfLongestSubstring(s));
    }
}
