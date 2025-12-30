package DSA_Course.a4_Searching_Sorting;

public class a3_BubbleSort {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void bubbleSort(int[] nums) {
        int n = nums.length - 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j-1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {41, 9 ,9 ,48, 11, 2 ,11, 12, 28, 10 ,15, 4 ,16 ,48};
        bubbleSort(nums);
    }
}
