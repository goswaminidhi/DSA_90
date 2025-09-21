package ArrayAndString;

public class ContainerWithMostWater {
    static{
        for(int i=0;i<60;i++){
            maxArea(new int[]{0,0});
        }
    }
    public static int maxArea(int[] height) {
        //This is not optimal solution
//        int max = 0;
//        int right = height.length-1;
//        int left = 0;
//        int length = 0;
//        while (left < right) {
//            int width = right - left;
//            if (height[right] >= height[left]) {
//                length = Math.min(height[right], height[left]);
//                max = Math.max(max, width * length);
//                left++;
//            }
//            else {
//                length = Math.min(height[right], height[left]);
//                max = Math.max(max, width * length);
//                right--;
//            }
//        }
//        return max;

        //This is Optimal solution
            int area = 0;
            int right = height.length-1;
            int left = 0;
            while (left < right) {
                int width = right - left;
                int min = Math.min(height[right], height[left]);
                area = Math.max(area, width * min);
                while (left < right && height[left] <= min) {
                    left++;
                }
                while (left < right && height[right] <= min) {
                    right--;
                }
            }
        return area;
    }
    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(heights));
    }
}
