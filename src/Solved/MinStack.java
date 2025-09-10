package Solved;
//The code is completed but not Optimal yet.
import java.util.Stack;

public class MinStack {
    Stack<Integer> stack ;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        int ans = stack.peek();
        return ans;
    }

    public int getMin() {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < stack.size(); i++) {
                int elm1 = stack.get(i);
                ans = Math.min(ans,elm1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int val = 0;
        MinStack obj = new MinStack();
        obj.push(val);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
    }
}
