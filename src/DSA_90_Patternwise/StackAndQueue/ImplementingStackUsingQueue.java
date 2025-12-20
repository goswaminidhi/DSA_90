package DSA_90_Patternwise.StackAndQueue;

import java.util.Stack;

public class ImplementingStackUsingQueue {
    Stack<Integer> input;
    public void MyQueue() {
        input = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        int ans =  input.remove(input.size() - input.size());
        return ans;
    }

    public int peek() {
        int ans = input.get(input.size() - input.size());
        return ans;
    }

    public boolean empty() {
        if(input.empty()){
            return true;
        }
        return false;
    }
}
