package DSA_Course.String;

import java.util.Arrays;

public class a6_ReverseStringII {
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i = i + (2 * k)) {
            int left = i;
            int right = Math.min(i + k -1,arr.length -1);

            while (left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
        System.out.println(reverseStr("abcd", 2));
        System.out.println(reverseStr("abcd", 4));
        System.out.println(reverseStr("abcdefg", 3));
    }
}
