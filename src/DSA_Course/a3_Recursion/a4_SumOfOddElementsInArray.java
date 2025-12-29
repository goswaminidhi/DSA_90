package DSA_Course.a3_Recursion;

public class a4_SumOfOddElementsInArray {
    public static int sumOfArrayHelper(int[] nums, int index) {
        if (index == nums.length - 1) {
            if (nums[index] % 2 != 0) {
                return nums[index];
            } else {
                return 0;
            }
        }
            if (nums[index] % 2 != 0) {
                return nums[index] + sumOfArrayHelper(nums, index + 1);
            } else {
                return sumOfArrayHelper(nums, index + 1);
            }
        }

        public static int sumOfArray ( int[] nums){
            return sumOfArrayHelper(nums, 0);
        }

        public static void main (String[]args){
            int[] arr = {2, 4, 1, 6, 9, 8};
            System.out.println(sumOfArray(arr));
        }
    }
