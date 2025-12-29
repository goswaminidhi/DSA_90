package DSA_Course.a3_Recursion;

public class a2_SumOfFirstN_Numbers {
    public static int sumFirstN(int num){
        if(num == 1){
            return num;
        }
        return num+sumFirstN(num-1);

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumFirstN(n));

    }
}
