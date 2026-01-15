package DSA_Course.StackAndQueue;

import java.util.Stack;

public class a2_MyQueue2 {
    Stack<Integer> stack1;
    Stack<Integer> helperStack;

    public a2_MyQueue2() {
        stack1 = new Stack<>();
        helperStack = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if(!helperStack.isEmpty()){
           return helperStack.pop();
        }
       while(!stack1.empty()){
           helperStack.push(stack1.pop());
       }
       return helperStack.pop();

    }

    public int peek() {
        if(!helperStack.isEmpty()){
            return helperStack.peek();
        }
        while(!stack1.empty()){
            helperStack.push(stack1.pop());
        }
        return helperStack.peek();
    }

    public boolean empty() {
        if (stack1.size() == 0 && helperStack.size() == 0 ) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        a2_MyQueue2 obj = new a2_MyQueue2();
        obj.push(1);
        obj.push(2);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
    }
}
