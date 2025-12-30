package DSA_Course.a4_Searching_Sorting;

public class a2_BinarySearch {
    public static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
             int mid = start+(end - start)/2;
            if(target == arr[mid]){
                return mid;
            } else if (target > arr[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,23,56,78,90};
        int target = 4;
        System.out.println(search(arr,target));
    }
}
