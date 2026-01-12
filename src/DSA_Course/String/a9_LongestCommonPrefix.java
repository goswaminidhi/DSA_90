package DSA_Course.String;

public class a9_LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int len = prefix.length();

        for (int j = 1; j < strs.length; j++) {
            String word = strs[j];
            while (!word.startsWith(prefix)) {
                len--;
                prefix = prefix.substring(0, len);
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(longestCommonPrefix(new String[]{"ab","a"}));
    }
}
