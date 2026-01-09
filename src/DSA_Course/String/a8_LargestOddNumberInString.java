package DSA_Course.String;

public class a8_LargestOddNumberInString {
    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int val = Character.valueOf(num.charAt(i));
            if (val % 2 != 0) {
                return num.substring(0, i+1);
            }

        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println("52 " + largestOddNumber("52"));
        System.out.println("4206 " + largestOddNumber("4206"));
        System.out.println("35427 " + largestOddNumber("35427"));
        System.out.println("10133890 " + largestOddNumber("10133890"));
        System.out.println("7542351161 " + largestOddNumber("7542351161"));
        System.out.println("239537672423884969653287101 " + largestOddNumber("239537672423884969653287101"));
    }
}
