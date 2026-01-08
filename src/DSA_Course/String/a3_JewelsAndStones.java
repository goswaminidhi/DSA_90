package DSA_Course.String;

import java.util.HashSet;
import java.util.Set;

public class a3_JewelsAndStones {
    /*
    When ever you have to search in the string or you have to find out then always use hashmap,set or freq array etc.
     */
    //Approach 1
    public static int numJewelsInStones1(String jewels, String stones) {
        int types = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if(stones.charAt(i) == jewels.charAt(j)){
                    types++;
                    break;
                }
            }
        }
        return types;
    }
    //Approach 2
    public static int numJewelsInStones2(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if(jewels.contains(String.valueOf(stones.charAt(i)))){
                count++;
            }
        }
        return count;
    }

    //Approach 3
    public static int numJewelsInStones3(String jewels, String stones) {
        Set<Character> map = new HashSet<>();
        int noOfJewels = 0;
        for (int i = 0; i < jewels.length(); i++) {
            map.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if(map.contains(stones.charAt(i))){
                noOfJewels++;
            }
        }
        return noOfJewels;
    }
    public static void main(String[] args) {
        String jewels = "aA";
        String stone = "bbAaabb";
        System.out.println(numJewelsInStones1(jewels,stone));
        System.out.println(numJewelsInStones3(jewels,stone));
    }
}
