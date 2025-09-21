package ArrayAndString;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        //This is Better Solution not optimal
//        int expectedPlaces = 0;
//        int[] arr = new int[heights.length];
//        for (int i = 0; i < heights.length; i++) {
//            arr[i] = heights[i];
//        }
//
//        Arrays.sort(arr);
//        for (int i = 0; i < heights.length; i++) {
//            if(heights[i] != arr[i]){
//                expectedPlaces++;
//            }
//        }
//
//        return expectedPlaces;
        int ans = 0;
        int[] sort = new int[101];
        for (int i = 0; i < heights.length; i++) {
            sort[heights[i]]++;
        }
        int[] expectedHeight = new int[heights.length];
        {
            int i = 0;
            int j = 0;
            while (i < sort.length){
                if(sort[i] != 0){
                    expectedHeight[j++] = i;
                    sort[i]--;
                    continue;
                }
                i++;
            }
        }
        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != expectedHeight[i]){
                ans++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));

    }
}
