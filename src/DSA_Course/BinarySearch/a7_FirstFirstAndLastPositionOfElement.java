package DSA_Course.BinarySearch;

public class a7_FirstFirstAndLastPositionOfElement {
    //Approach1
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        if (nums.length == 0) {
            return ans;
        }
        int left1 = 0;
        int right1 = nums.length - 1;
        while (left1 < right1) {
            int mid = left1 + (right1 - left1) / 2;
            if (nums[mid] < target) {
                left1 = mid + 1;
            } else {
                right1 = mid;
            }
        }
        if (nums[left1] == target) {
            ans[0] = left1;
        }
        int left2 = 0;
        int right2 = nums.length - 1;
        while (left2 < right2) {
            int mid = left2 + (right2 - left2 + 1) / 2;
            if (nums[mid] > target) {
                right2 = mid - 1;
            } else {
                left2 = mid;
            }
        }
        if (nums[left2] == target) {
            ans[1] = left2;
        }
        return ans;
    }

    //Approach2
    public static int[] searchRange1(int[] nums, int target) {
        int left1 = 0;
        int right1 = nums.length - 1;
        int[] ans = {-1, -1};
        while (left1 <= right1) {
            int mid = left1 + (right1 - left1) / 2;
            if (nums[mid] == target) {
                ans[0] = mid;
                right1 = mid - 1;
            } else if (nums[mid] < target) {
                left1 = mid + 1;
            } else {
                right1 = mid - 1;
            }
        }
        int left2 = 0;
        int right2 = nums.length - 1;
        while (left2 <= right2) {
            int mid = left2 + (right2 - left2) / 2;
            if (nums[mid] == target) {
                ans[1] = mid;
                left2 = mid + 1;
            } else if (nums[mid] < target) {
                left2 = mid + 1;
            } else {
                right2 = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //Approach1
        System.out.println(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
        System.out.println(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));
        System.out.println(searchRange(new int[]{}, 0));

        //Approach2
        System.out.println(searchRange1(new int[]{5, 7, 7, 8, 8, 10}, 8));
        System.out.println(searchRange1(new int[]{5, 7, 7, 8, 8, 10}, 6));
        System.out.println(searchRange1(new int[]{}, 0));
    }
}
