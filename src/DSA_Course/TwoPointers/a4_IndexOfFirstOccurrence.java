package DSA_Course.TwoPointers;

public class a4_IndexOfFirstOccurrence {
    //Approach 1
    public static int strStr1(String haystack, String needle) {
        int n = needle.length();
        for (int i = 0; i < haystack.length() - n; i++) {
            String subString = haystack.substring(i,i+n);
            if(subString.equals(needle)){
                return i;
            }
        }
        return -1;
    }

    //Approach 2
    public static int strStr2(String haystack, String needle) {
        int n = needle.length();
        for (int i = 0; i <= haystack.length() - n; i++) {
            int j;
            for ( j = 0; j < n; j++) {
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            }
            if(j == n ){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(strStr2("sadbutsad","sad"));
        System.out.println(strStr2("leetcode","leeto"));
        System.out.println(strStr2("hello","ll"));
    }
}
