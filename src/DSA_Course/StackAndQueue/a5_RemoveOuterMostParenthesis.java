package DSA_Course.StackAndQueue;

import java.util.Stack;

public class a5_RemoveOuterMostParenthesis {
    public static String removeOuterParentheses(String s) {
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

    public static void main(String[] args) {
        //System.out.println("(()())(()) ->"+removeOuterParentheses("(()())(())"));
        System.out.println("(()())(())(()(())) ->" + removeOuterParentheses("(()())(())(()(()))"));
        System.out.println("()() ->" + removeOuterParentheses("()()"));
    }
}
