package DSA_Course.BinarySearch;

public class a2_GuessGame {
    static int guess(int num) {
        return num;
    }

    public static int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left <= right){
            int mid = left+((right-left)/2);
            int res = guess(mid);
            if(res == 0){
                return mid;
            } else if (res < 0) {
                right = mid - 1;
            }else{
                left = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(6));
    }
}
