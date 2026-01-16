package DSA_Course.StackAndQueue;

import java.util.Stack;

public class a5_RemoveOuterMostParenthesis {
    //Approach 1 -> With Stack
    public static String removeOuterParentheses1(String s) {
        String ans = "";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || c == '(') {
                stack.push(c);
                if (stack.size() > 1) {
                    ans = ans + c;
                }
            } else {
                if (stack.size() > 1) {
                    ans = ans + c;
                }
                stack.pop();

            }
        }
        return ans;
    }
    //Approach 2 -> Without Stack
    public static String removeOuterParentheses2(String s) {
        int balance = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                balance++;
                if(balance > 1){
                    ans = ans + s.charAt(i);
                }
            }else{
                if(balance > 1) {
                    ans = ans + s.charAt(i);
                }
                balance--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("(()())(()) ->"+removeOuterParentheses2("(()())(())"));
        System.out.println("(()())(())(()(())) ->" + removeOuterParentheses2("(()())(())(()(()))"));
        System.out.println("()() ->" + removeOuterParentheses2("()()"));
    }
}
