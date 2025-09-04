package Solved;

import java.util.HashMap;

public class ContiguousArray {
    public static int findMaxLength(int[] nums) {
        int sum = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }else {
                maxLength = Math.max(maxLength,i - map.get(sum));
            }

        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(nums));
    }
}
