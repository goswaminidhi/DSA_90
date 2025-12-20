package DSA_90_Patternwise.ArrayAndString;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            map.put(str,map.getOrDefault(s.charAt(i),0)+1);
            if(map.get(str) == 1){
                que.add(i);
            }else {
                que.remove();
            }
        }
        System.out.println(que);
//        if(que.peek() != null){
//            return s.charAt(que.peek());
//        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(firstUniqChar(str));
    }
}
