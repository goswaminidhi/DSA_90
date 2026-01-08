package DSA_Course.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a2_WordContainingCharacter {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String wrd = words[i];
            for (int j = 0; j < wrd.length(); j++) {
                if(wrd.charAt(j)==x){
                    list.add(i);
                    break;
                }
            }

        }
        return list;
    }
    public static void main(String[] args) {
        String[] st = {"abc","bcd","aaaa","cbc"};
        System.out.println(findWordsContaining(st,'a'));
    }
}
