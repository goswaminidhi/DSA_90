package DSA_90_Patternwise.ArrayAndString;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int[] array = new int[4];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            array[i] = sum;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(runningSum(nums));
    }
}
