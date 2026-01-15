package DSA_Course.StackAndQueue;

import java.util.Stack;

public class a2_MyQueue1 {
    Stack<Integer> stack1;
    Stack<Integer> helperStack;

    public a2_MyQueue1() {
        stack1 = new Stack<>();
        helperStack = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        int size = stack1.size();
        for (int i = 0; i < size - 1; i++) {
            helperStack.push(stack1.pop());
        }
        int remove = stack1.pop();
        int size2 = helperStack.size();

        for (int i = 0; i < size2; i++) {
            stack1.push(helperStack.pop());
        }
        return remove;
    }

    public int peek() {
        int size = stack1.size();
        for (int i = 0; i < size - 1; i++) {
            helperStack.push(stack1.pop());
        }
        int top = stack1.peek();
        int size2 = helperStack.size();
        for (int i = 0; i < size2; i++) {
            stack1.push(helperStack.pop());
        }
        return top;
    }

    public boolean empty() {
        if (stack1.size() == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Stack<Integer> stack= new Stack<>();
        a2_MyQueue1 obj = new a2_MyQueue1();
        obj.push(1);
        obj.push(1);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
    }
}
