package DSA_Course.a4_Searching_Sorting;

import java.util.Arrays;

public class a6_MergeSort {
    public static void merge(int[] arr){
        mergeSort(arr,0, arr.length);
    }
    public static void mergeSort(int[] arr,int start,int end){
        if (end == 0) {
            return;
        }

    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 12, 1, 6, 56, 9, 1};
        System.out.println(Arrays.toString(arr));
        merge(arr);
        System.out.println(Arrays.toString(arr));
    }
}
