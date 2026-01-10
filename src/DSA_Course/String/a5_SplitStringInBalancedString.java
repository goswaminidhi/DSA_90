package DSA_Course.String;

public class a5_SplitStringInBalancedString {
    public static int balancedStringSplit(String s) {
        int balanced = 0;
        int noSubString = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='L'){
                balanced++;
            }else {
                balanced--;
            }
            if(balanced == 0){
                noSubString++;
            }
        }
        return noSubString;
    }
    public static void main(String[] args) {
        System.out.println("RLRRLLRLRL:" +balancedStringSplit("RLRRLLRLRL"));
        System.out.println("RLRRRLLRLL:"+balancedStringSplit("RLRRRLLRLL"));
        System.out.println("LLLLRRRR: "+balancedStringSplit("LLLLRRRR"));
    }
}
