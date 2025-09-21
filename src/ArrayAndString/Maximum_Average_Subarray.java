package ArrayAndString;

public class Maximum_Average_Subarray {
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum +nums[i];
        }
        int max_sum = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum+ nums[i] -nums[i-k]; //nums[i-k] because k will always remain same i.e for eaxmple 4
                                                       //but i will always increase for example :
                                                       //here i = 4 and k =4 ->0 than i = 5 and k = 4 ->1
            max_sum= Math.max(sum,max_sum);
        }
        return  (double) max_sum/k;
    }
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(arr,k));
    }
}