package DSA_Course.a3_Recursion;

public class a7_PowerOf2 {
    public static int powerOf2(int num){
        if(num == 0){
            return 1;
        }
        return 2 * powerOf2(num-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(powerOf2(n));
    }
}
