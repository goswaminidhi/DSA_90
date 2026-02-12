package DSA_Course.BinarySearch;

public class a9_SingleElementInSortedArray {
    public static int singleNonDuplicate(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == nums[mid - 1]) {
                int leftCount = mid - 1 - left;
                if (leftCount % 2 == 1) {
                    right = mid - 2;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] == nums[mid + 1]) {
                int rightCount = mid - left;
                if (rightCount % 2 == 1) {
                    right = mid - 1;
                } else {
                    left = mid + 2;
                }
            } else {
                return nums[mid];
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
        System.out.println(singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}));
    }
}
