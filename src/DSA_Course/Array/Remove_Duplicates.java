package DSA_Course.Array;

public class Remove_Duplicates {
    public static int[] removeDuplicate(int[] num){
        if(num.length == 0){
            return new int[0];
        }
        int index = 1;
        for (int i = 1; i < num.length; i++) {
            if(num[i-1] != num[i]){
                num[index] = num[i];
                index++;
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        return num;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,2,2,2,3,3,4,9,10};
        System.out.println(removeDuplicate(nums).toString());
    }
}
