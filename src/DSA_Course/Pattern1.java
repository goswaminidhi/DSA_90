package DSA_Course;

public class Pattern1 {
    public static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < i+1; j++) {
                row.append("* ");
            }
            System.out.println(row);
        }
    }
    
    public static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < i+1; j++) {
                row.append(j+1);
            }
            System.out.println(row);
        }
    }

    public static void pattern3(int n){
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < i+1; j++) {
                row.append(i+1);
            }
            System.out.println(row);
        }
    }

    public static void pattern4(int n){
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n - i; j++) {
                row.append(j+1);
            }
            System.out.println(row);
        }
    }

    public static void pattern5(int n){
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n - i; j++) {
                row.append("* ");
            }
            System.out.println(row);
        }
    }

    public static void pattern6(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >= 0; j--) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
//        pattern1(n);
//        pattern2(n);
//        pattern3(n);
//        pattern4(n);
//        pattern5(n);
        pattern6(n);
    }
}
