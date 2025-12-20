package DSA_90_Patternwise.StackAndQueue;

import java.util.Stack;

public class MinStack {
    //Not optimal solution
//    Stack<Integer> stack ;
//
//    public MinStack() {
//        stack = new Stack<>();
//    }
//
//    public void push(int val) {
//        stack.push(val);
//    }
//
//    public void pop() {
//        stack.pop();
//    }
//
//    public int top() {
//        int ans = stack.peek();
//        return ans;
//    }
//
//    public int getMin() {
//        int ans = Integer.MAX_VALUE;
//        for (int i = 0; i < stack.size(); i++) {
//                int elm1 = stack.get(i);
//                ans = Math.min(ans,elm1);
//        }
//        return ans;
//      }


    //This is efficient solution
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        } else if (minStack.peek() > stack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if(minStack.peek().equals(stack.peek())){
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
    }
}
