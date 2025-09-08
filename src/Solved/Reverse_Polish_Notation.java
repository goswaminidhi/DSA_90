package Solved;

import java.util.Stack;
//Code Not completed
public class Reverse_Polish_Notation {
    public static int evalRPN(String[] tokens) {
        //This One is not optimal solution

//        int ans = 0;
//        Stack<String> stack = new Stack<>();
//        for (int i = 0; i < tokens.length; i++) {
//            String s = tokens[i];
//            if(s.matches("-?\\d+")){
//                stack.push(s);
//            }else if (!stack.isEmpty()){
//                ans = Integer.parseInt(stack.pop());
//                int num1 = Integer.parseInt(stack.pop());
//                switch (s){
//                    case "+":
//                        ans = ans+num1;
//                        stack.push(String.valueOf(ans));
//                        break;
//                    case "/":
//                        ans =  num1/ans;
//                        stack.push(String.valueOf(ans));
//                        break;
//                    case "*":
//                        ans = ans*num1;
//                        stack.push(String.valueOf(ans));
//                        break;
//                    case "-":
//                        ans = num1 - ans;
//                        stack.push(String.valueOf(ans));
//                        break;
//
//                }
//            }
//        }
//        if (!stack.isEmpty()){
//            ans = Integer.parseInt(stack.pop());
//        }
        //Another Way of Solving this

        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "-" -> {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 - num1);
                }
                case "/" -> {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 / num1);
                }
                default -> stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String[] arr = {"3","11","+","5","-"};
        System.out.println(evalRPN(arr));
    }
}
