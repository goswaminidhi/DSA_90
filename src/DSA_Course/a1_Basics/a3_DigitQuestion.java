package DSA_Course.a1_Basics;

import java.util.Scanner;

public class a3_DigitQuestion {
    public static int countDigit(int num) {
        int count = 0;
        if (num < 0) {
            num = num * -1;
        }
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static String reverseNumber(int num) {
        int n = num;
        String revNum = "";

        if (n < 0) {
            n = n * -1;
            revNum = "-" + revNum;
        }
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            revNum = revNum + lastDigit;
            }

        return revNum;
    }

    public static boolean palindrome(int num) {
        if (num < 0) {
            return false;
        }
        String n = String.valueOf(num);
        if(n.equals(reverseNumber(num))){
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();


        System.out.println("Word count is:" + countDigit(num));
        System.out.println("Reverse num is:" + reverseNumber(num));
        System.out.println("Is Palindrome: " + palindrome(num));

    }
}
