package DSA_Course.TwoPointers;

public class a2_TwoSumII_InputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j){
            if(numbers[i] + numbers[j] > target){
                j--;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            }else{
                return new int[]{i+1,j+1};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2,7,11,15},9));
        System.out.println(twoSum(new int[]{2,3,4},6));
        System.out.println(twoSum(new int[]{-1,0},-1));
    }
}
