package DSA_Course.TwoPointers;

import java.util.HashMap;

public class a1_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int rem =  target - nums[i];
            if(map.containsKey(rem) && map.get(rem)!= i){
                return new int[]{map.get(rem),i};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        System.out.println(twoSum(new int[] {2,7,11,15},9));
        System.out.println(twoSum(new int[] {3,2,4},6));
    }
}
