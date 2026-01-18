package DSA_Course.StackAndQueue;

import java.util.HashMap;
import java.util.Stack;

public class a8_DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        stack.push(temperatures.length - 1);
        int[] ans = new int[temperatures.length];
        for (int i = temperatures.length - 2; i >= 0; i--) {
            while (!stack.isEmpty()) {
                int val = temperatures[stack.peek()];
                if (temperatures[i] >= val) {
                    stack.pop();
                } else {
                    ans[i] = stack.peek() - i;
                    break;
                }
            }
            if (stack.size() == 0) {
                ans[i] = 0;
            }
            stack.push(i);
        }


        return ans;
    }

    public static void main(String[] args) {
//        System.out.println(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
//        System.out.println(dailyTemperatures(new int[]{30, 40, 50, 60}));
        System.out.println(dailyTemperatures(new int[]{89, 62, 70, 58, 47, 47, 46, 76, 100, 70}));
    }
}
