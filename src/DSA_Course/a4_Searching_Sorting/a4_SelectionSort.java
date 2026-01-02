package DSA_Course.a4_Searching_Sorting;

import java.lang.classfile.components.ClassPrinter;
import java.util.Arrays;
import java.util.HashMap;

public class a4_SelectionSort {
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int actualMin = minIndex(i, arr);
            int temp = arr[i];
            arr[i] = arr[actualMin];
            arr[actualMin] = temp;
        }
    }

    private static int minIndex(int start, int[] arr) {
        int minInd = 0;
        int min = Integer.MAX_VALUE;
        for (int i = start; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minInd = i;
            }
        }
        return minInd;
    }

    public static void selection(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 12, 1, 6, 56, 9};
        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
