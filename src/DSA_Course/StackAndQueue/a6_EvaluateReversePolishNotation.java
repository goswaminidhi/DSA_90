package DSA_Course.StackAndQueue;

import java.util.Stack;

public class a6_EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+") || tokens[i].equals("/") || tokens[i].equals( "*") || tokens[i].equals("-")  ){
                int val1 = Integer.parseInt(stack.pop());
                int val2 = Integer.parseInt(stack.pop());
                switch (tokens[i]){
                    case "*":
                        ans = val1*val2;
                        break;
                    case "/":
                        ans = val2/val1;
                        break;
                    case "+":
                        ans = val1+val2;
                        break;
                    case "-":
                        ans = val2-val1;
                        break;
                }
                stack.push(String.valueOf(ans));
            }else {
                stack.push(tokens[i]);

            }
        }
        if(!stack.isEmpty()){
            ans = Integer.parseInt(stack.peek());
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[] {"2","1","+","3","*"}));
        System.out.println(evalRPN(new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
        System.out.println(evalRPN(new String[] {"18"}));
        System.out.println(evalRPN(new String[] {"4","3","-"}));
    }
}
