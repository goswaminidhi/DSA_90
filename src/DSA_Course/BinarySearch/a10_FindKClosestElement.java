package DSA_Course.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class a10_FindKClosestElement {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - k;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if ((arr[mid + k] - x) < (x - arr[mid])) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3));
        System.out.println(findClosestElements(new int[]{1, 1, 2, 3, 4, 5}, 4, -1));
    }
}
