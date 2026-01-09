package DSA_Course.String;

public class a7_ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int start = 0;
        int end = s.length()-1;
        while (start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama "));
        System.out.println(isPalindrome("race a car "));
    }
}
