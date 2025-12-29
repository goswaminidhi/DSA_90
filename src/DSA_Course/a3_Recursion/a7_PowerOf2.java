package DSA_Course.a3_Recursion;

public class a7_PowerOf2 {
    public static int powerOf2(int num) {
        if (num == 0) {
            return 1;
        }
        return 2 * powerOf2(num - 1);
    }

    public static boolean powerHelper(double num) {
        if (num == 1) {
            return true;
        } else if (num < 1) {
            return false;
        }
        return powerHelper(num / 2);
    }

    public static boolean power(int num) {
            return powerHelper(num);

    }

    public static void main(String[] args) {
        int n = 5;
        // System.out.println(powerOf2(n));
        System.out.println(power(16777217));
    }
}
