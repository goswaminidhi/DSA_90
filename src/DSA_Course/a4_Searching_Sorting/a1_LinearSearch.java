package DSA_Course.a4_Searching_Sorting;

public class a1_LinearSearch {
    public static int linearSearch(int[] arr,int num){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,15,7,4,8,9};
        System.out.println(linearSearch(arr,8));
    }
}
