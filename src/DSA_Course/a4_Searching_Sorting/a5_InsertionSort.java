package DSA_Course.a4_Searching_Sorting;

import java.util.Arrays;

public class a5_InsertionSort {
    public static void insertion(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;
            while (nums[prev] > curr && prev >= 0) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = curr;
        }
    }


    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 12, 1, 6, 56, 9, 1};
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
