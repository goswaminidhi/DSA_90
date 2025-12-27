package DSA_Course.a2_Array;

public class a6_MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                int temp = nums[i];;
                nums[i] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
