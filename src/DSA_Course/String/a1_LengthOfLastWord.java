package DSA_Course.String;

public class a1_LengthOfLastWord {
    //Not so Optimal Solution
    public static int lengthOfLastWord1(String s) {
        s.replaceAll("\\s+"," ");
        s.trim();
        int len = 0;
        for (int i = s.length()-1; i > 0; i--) {
            len++;
            if(s.charAt(i) == ' '){
                break;
            }
        }
        return len;
    }
    //2nd Optimal solution
    public static int lengthOfLastWord2(String s) {
        String[] st = s.split(" ");
        return st[st.length-1].length();
    }
    //Optimal Solution
    public static int lengthOfLastWord3(String s) {
        int len = 0;
        for (int i = s.length()-1; i >= 0 ; i--) {
            if(s.charAt(i) == ' ' && len == 0){
                continue;
            } else if (s.charAt(i) == ' ' && len > 0) {
                break;
            }
            len++;
        }
        return len;
    }
    public static void main(String[] args) {
        String st= "Hello World";
       // System.out.println(lengthOfLastWord1(st));
        System.out.println(lengthOfLastWord3(st));
    }
}
