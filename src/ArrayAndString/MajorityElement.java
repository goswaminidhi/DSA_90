package ArrayAndString;

import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int ans = 0;
        int majority = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) > majority){
                ans = nums[i];
                majority = map.get(nums[i]);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
