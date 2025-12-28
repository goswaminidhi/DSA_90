package DSA_Course.a2_Array;

public class a7_MaxConsecutiveOne {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count++;
            }else {
                count = 0;
            }
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,9,8};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
