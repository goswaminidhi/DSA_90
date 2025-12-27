package DSA_Course.a1_Basics;

public class a1_Second_Largest {
    public static int secondLargest(int[] nums){
        int largest = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
        }
        int secondLargest = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > secondLargest && secondLargest < largest && num < largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(secondLargest(arr));
    }
}
