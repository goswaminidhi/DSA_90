package DSA_Course.a3_Recursion;

public class a8_RabbitPopulation {
    public static int rabbit(int n) {
        if (n <= 0) {
            return 2;
        }
        return 2 * rabbit(n - 1) ;
    }

    public static void main(String[] args) {
        int month = 4;
        System.out.println(rabbit(month));
    }
}
