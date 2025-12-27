package DSA_Course.a2_Array;

public class a2_Remove_Elements {
    public static int removeElement(int[] nums, int val) {
        //1 method
//        Arrays.sort(nums);
//        int index = nums.length-1;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == val){
//                nums[i] = nums[index];
//                index--;
//            }
//        }
//        return index+1 ;

        //2 Method
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 1;
        System.out.println(removeElement(nums,val));
    }
}
