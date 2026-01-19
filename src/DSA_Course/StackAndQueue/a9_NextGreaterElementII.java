package DSA_Course.StackAndQueue;

import java.util.Stack;

public class a9_NextGreaterElementII {
    //Approach 1 -> increasing size of an array
    public static int[] nextGreaterElements1(int[] nums) {
        int[] newArray = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[i];
        }
        for (int i = nums.length; i < newArray.length; i++) {
            newArray[i] = nums[i - nums.length];
        }

        int ans[] = new int[newArray.length];
        Stack<Integer> stack = new Stack<>();
        ans[newArray.length - 1] = -1;
        stack.push(newArray[newArray.length - 1]);
        //Same can also be written as
//        for (int i = newArray.length - 2; i >= 0; i--) {
//            if(newArray[i] < stack.peek()){
//                ans[i] = stack.peek();
//                stack.push(newArray[i]);
//            }else{
//                while (!stack.isEmpty()) {
//                    if (newArray[i] >= stack.peek()) {
//                        stack.pop();
//                    } else {
//                        ans[i] = stack.peek();
//                        break;
//                    }
//                }
//                if(stack.size() == 0){
//                    ans[i] = -1;
//                }
//                stack.push(newArray[i]);
//            }
//        }

        for (int i = newArray.length - 2; i >= 0; i--) {
            while (!stack.isEmpty()) {
                if (newArray[i] < stack.peek()) {
                    ans[i] = stack.peek();
                    stack.push(newArray[i]);
                    break;
                } else {
                    stack.pop();
                }
            }
            if (stack.size() == 0) {
                ans[i] = -1;
            }
            stack.push(newArray[i]);
        }
        int[] ans2 = new int[ans.length / 2];
        for (int i = 0; i < ans.length / 2; i++) {
            ans2[i] = ans[i];
        }
        return ans2;
    }

    //Approach 2 -> increasing size of an array
    public static int[] nextGreaterElements2(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(ans[n - 1]);
        for (int i = (2 * n) - 2; i >= 0; i--) {
            while (!stack.isEmpty()) {
                int top = stack.peek();
                if (nums[i % n] < top) {
                    ans[i % n] = top;
                    break;
                } else {
                    stack.pop();
                }
            }
            stack.push(nums[i % n]);
        }
        return ans;
    }


    public static void main(String[] args) {
//        System.out.println(nextGreaterElements2(new int[]{1, 2, 1}));
//         System.out.println(nextGreaterElements2(new int[]{1, 2, 3, 4, 3}));
        System.out.println(nextGreaterElements2(new int[]{-1}));
    }
}
