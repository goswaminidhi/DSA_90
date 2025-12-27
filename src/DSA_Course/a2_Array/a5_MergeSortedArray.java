package DSA_Course.a2_Array;


public class a5_MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //1 way(Not Optimal Solution)
//        int index = m+n;
//        int j = 0;
//        while (j != n){
//            nums1[index-1] = nums2[j];
//            index--;
//            j++;
//        }
//        Arrays.sort(nums1);

        // 2way(Optimal solution)
        int p1 = m - 1;
        int p2 = n - 1;
        int index = n + m - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[index] = nums1[p1];
                p1--;
            } else {
                nums1[index] = nums2[p2];
                p2--;
            }
            index--;
        }

        for (int l = 0; l < m + n; l++) {
            System.out.print(nums1[l] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        merge(nums1, 0, nums2, 1);
    }
}
