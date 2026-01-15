package DSA_Course.StackAndQueue;

import java.util.Stack;

public class a4_MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public a4_MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
//        stack.push(val);
//        if(minStack.isEmpty() || stack.peek() <= minStack.peek()){
//            minStack.push(val);
//        }
        if(!minStack.isEmpty()){
            minStack.push(Math.min(minStack.peek(),val));
        }else {
            minStack.push(val);
        }
        stack.push(val);
    }

    public void pop() {
//        int remove = stack.pop();
//        if(remove == minStack.peek()){
//            minStack.pop();
//        }
        minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
