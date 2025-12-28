package DSA_Course.a2_Array;

public class a9_SingleNumber {
    public static int singleNumber(int[] nums) {
        //0 XOR 0 = 0 (Same)
        //0 XOR 1 = 1 (Different)
        //1 XOR 0 = 1 (Different)
        //1 XOR 1 = 0 (Same)
        int xor = 0;
        for (int num : nums) {
            xor = xor ^ num;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }
}
