package DSA_Course.StackAndQueue;

import java.util.HashMap;
import java.util.Stack;

public class a7_NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(nums2[nums2.length - 1]);
        map.put(nums2[nums2.length - 1], -1);
        for (int i = nums2.length - 2; i >= 0; i--) {
            if (nums2[i] < stack.peek()) {
                map.put(nums2[i], stack.peek());
                stack.push(nums2[i]);
            } else if (nums2[i] > stack.peek()) {
                while (!stack.isEmpty()) {
                    int val = stack.peek();
                    if (val < nums2[i]) {
                        stack.pop();
                    } else {
                        map.put(nums2[i], stack.peek());
                        break;
                    }
                }
                if (stack.size() == 0) {
                    map.put(nums2[i], -1);
                }
                stack.push(nums2[i]);
            }
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
        System.out.println(nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4}));
        System.out.println(nextGreaterElement(new int[]{1, 3, 5, 2, 4}, new int[]{6, 5, 4, 3, 2, 1, 7}));
    }
}
