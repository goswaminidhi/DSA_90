package DSA_Course.a3_Recursion;

public class a1_PrintNto1 {
    public static void printNto1(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        printNto1(num-1);

    }
    public static void printNto2(int num){
        if(num == 0){
            return;
        }
        printNto2(num-1);
        System.out.println(num);



    }
    public static void main(String[] args) {
        int n = 10;
       // printNto1(5);
        printNto2(5);
    }
}
