package DSA_Course.Array;

public class Reverse_String {
    public static void reverseString(String[] s) {
        int end = s.length-1;
        for (int i = 0; i < s.length; i++) {
            String s1 = s[i];
             s[i] = s[end];
             s[end] = s1;
            end--;
            if(i >= end){
                break;
            }
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }
    }
    public static void main(String[] args) {
       String [] arr = {"A"," ","m","a","n",","," ","a"," ","p","l","a","n",","," ","a"," ","c","a","n","a","l",":"," ",
                "P","a","n","a","m","a"};
        reverseString(arr);
    }
}
