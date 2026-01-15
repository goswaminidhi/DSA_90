package DSA_Course.StackAndQueue;

import java.util.Stack;

public class a3_ValidParenthesis {
    //Approach 2
    public static boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ){
                stack.push(s.charAt(i));
            } else if (stack.isEmpty()) {
                if ( s.charAt(i) == '}') {
                    return false;
                } else if (s.charAt(i) == ')') {
                    return false;
                }else if (s.charAt(i) == ']') {
                    return false;
                }
            } else if(s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')'){
                if (stack.peek() == '{' && s.charAt(i) == '}') {
                    stack.pop();
                }
                else if (stack.peek() == '[' && s.charAt(i) == ']') {
                    stack.pop();
                }else if (stack.peek() == '(' && s.charAt(i) == ')') {
                    stack.pop();
                }else{
                    return false;
                }
            }

        }
        if(stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    //Approach 2
    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }else if(c == '['){
                stack.push(']');
            }else if(c == '{'){
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid1("()[]{}"));
        System.out.println(isValid1("(]"));
        System.out.println(isValid1("({){}"));
        System.out.println(isValid2("}"));
        System.out.println(isValid2("(])"));
    }
}
