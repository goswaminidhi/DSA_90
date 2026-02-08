package DSA_Course.BinarySearch;

public class a6_FindMinElementInSortedArray {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int mid = 0;
        while (left <= right) {
            if (nums[left] <= nums[right]) {
                return nums[left];
            }
            mid = left + (right - left) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (nums[left] > nums[mid]) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return nums[mid];
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));
        System.out.println(findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        System.out.println(findMin(new int[]{11, 13, 15, 17}));
        System.out.println(findMin(new int[]{2, 1}));
    }
}
