package Solved;

import java.util.Stack;

public class Daily_Temperature {
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = temperatures.length-1; i >= 0; i--) {
            if (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty() ){
                if(temperatures[i] > temperatures[stack.peek()]){
                    stack.pop();
                }
                ans[i] = stack.peek() - i;
            }
            stack.push(i);
            //stack.push(i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }


        return ans;
    }

    public static void main(String[] args) {
        int[] temp = {73,74,75,71,69,72,76,73};
        System.out.println(dailyTemperatures(temp));
    }
}
