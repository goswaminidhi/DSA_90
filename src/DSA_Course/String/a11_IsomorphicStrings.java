package DSA_Course.String;

import java.util.HashMap;

public class a11_IsomorphicStrings {
    //Approach 1
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
            }else if(map.containsKey(s.charAt(i))){
                Character c = map.get(s.charAt(i));
                if(c != t.charAt(i)){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
        System.out.println(isIsomorphic("foo","bar"));
        System.out.println(isIsomorphic("badc","baba"));
    }
}
