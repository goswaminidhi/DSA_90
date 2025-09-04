package Solved;

public class Two_Sum_Sorted {
    public static int[] twoSum(int[] numbers, int target) {
        int[] newArray = new int[2];

        int left = 0;
        int right = numbers.length-1;
        while (left <= right){
            int sum = numbers[right]+numbers[left];
            if(sum == target){
                newArray[0] = left+1;
                newArray[1] = right+1;
                return newArray;
            } else if (sum > target) {
                right--;
            }else {
                left++;
            }

        }

        for (int k = 0; k < newArray.length; k++) {
            System.out.println(newArray[k]);
        }

        return newArray;
    }
    public static void main(String[] args) {
        int[] arr = {-10,-8,-2,1,2,5,6};
        int target = 0;
        System.out.println(twoSum(arr,target));
    }
}
