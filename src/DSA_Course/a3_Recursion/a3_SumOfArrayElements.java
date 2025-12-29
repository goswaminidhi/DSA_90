package DSA_Course.a3_Recursion;

public class a3_SumOfArrayElements {
    public static int sumOfArray(int[] nums){
        return sumOfArrayHelper(nums,0);
    }
    public static int sumOfArrayHelper(int[] nums,int index){
        //base condition
        if(nums.length-1 == index){
            return nums[index];
        }
        //code
        return nums[index]+sumOfArrayHelper(nums,index+1);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println("Array Sum: "+sumOfArray(nums));
    }
}
