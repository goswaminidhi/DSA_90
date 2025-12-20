package DSA_90_Patternwise.ArrayAndString;

public class CharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int window_size = 0;
        int max_freq = 0;
        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;
            max_freq = Math.max(max_freq,freq[s.charAt(right) -'A']);

            int windowLength = right-left+1;
            if(windowLength- max_freq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            windowLength = right-left+1;
            window_size = Math.max(window_size,windowLength);
        }


        return window_size ;
    }
    public static void main(String[] args) {
        String s = "ABABBA";
        int k = 1;
        System.out.println(characterReplacement(s,k));
    }
}
