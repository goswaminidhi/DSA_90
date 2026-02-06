package DSA_Course.BinarySearch;

public class a4_FirstBadVersion {
    static boolean isBadVersion(int version){
     return true ;
    }
    public static int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        while (left < right){
            int mid = left + (right-left)/2;
            if(!isBadVersion(mid)){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return right;
    }
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
}
