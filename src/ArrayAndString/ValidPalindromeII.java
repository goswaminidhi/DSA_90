package ArrayAndString;

public class ValidPalindromeII {
    public static boolean palindrome(String s,int left,int right){
        while (left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left < right){
            if(s.charAt(left) != s.charAt(right)){
                return palindrome(s,left+1,right) || palindrome(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abac";
        System.out.println(validPalindrome(s));
    }
}
