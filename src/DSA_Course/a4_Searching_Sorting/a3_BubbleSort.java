package DSA_Course.a4_Searching_Sorting;

public class a3_BubbleSort {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void bubbleSort(int[] nums) {
        int n = nums.length ;
        for (int i = 0; i < n-1; i++) {//-1 because last element will automatically come to its place so no need to
            // move it
            boolean isSwapped = false;
            for (int j = 1; j < n-1-i; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j-1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                    isSwapped = true;
                }
                if(!isSwapped){
                    break;
                }
            }
        }

        /*
        If there is an iteration in which there in no swapping that means our array is already soreted than we will
        stop all the other iterations
         */
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {41, 9 ,9 ,48, 11, 2 ,11, 12, 28, 10 ,15, 4 ,16 ,48};
        bubbleSort(nums);
    }
}
