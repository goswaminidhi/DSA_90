package Solved;

public class MaximumConsecutive1 {
    public static int longestOnes(int[] nums, int k) {
//        int ans = 0;
//        int left = 0;
//        int right = 0;
//        int result = 0;
//        while (right != nums.length){
//            if(nums[right] == 0 & k != 0){
//                result++;
//                right++;
//                k--;
//            } else if (nums[right] == 1 ) {
//                result++;
//                right++;
//            } else if (nums[right] == 0) {
//                if(nums[left] == 0){
//                    k++;
//                }
//                left++;
//                result = right - left;
//            }
//            ans = Math.max(result, ans);
//        }
//        return ans;

        //Another way of doing it
        int max = 0, start = 0;

        for (int end = 0; end < nums.length; end++) {
            k -= (1 - nums[end]);  // If nums[end] is 0, reduce k by 1

            if (k < 0) {
                // Too many 0s flipped — shrink window from start
                k += (1 - nums[start]);
                start++;
            } else {
                max = Math.max(end - start + 1, max);  // Update max length
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(longestOnes(arr,k));
    }
}
