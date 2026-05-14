package DSA_Course.HashMap;

public class a1_PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] hashS = new int[26];
        int[] hashW = new int[26];
        int windowLength = s1.length();

        for (int i = 0; i < windowLength; i++) {
            hashS[s1.charAt(i) - 'a']++;
            hashW[s2.charAt(i) - 'a']++;
        }
        int i = 0, j = windowLength - 1;
        while (j < s2.length()) {
            if (isHashSame(hashS, hashW)) return true;
            hashW[s2.charAt(i) - 'a']--;
            i++;
            j++;
            if (j < s2.length())
                hashW[s2.charAt(j) - 'a']++;
        }
        return false;
    }
    private boolean isHashSame(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
