package DSA_Course.BinarySearch;

public class a1_Sqrt {
    public static int mySqrt(int x) {
        if (x < 2) return x;

        int left = 2;
        int right = x / 2;
        while (left <= right) {
//            int mid = (left + right) / 2;
            int mid = left+((right-left)/2);
            long square = (long) mid * mid;
            if (x == square) {
                return mid;
            } else if (x > square) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
    }
}
