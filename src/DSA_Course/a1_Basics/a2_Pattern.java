package DSA_Course.a1_Basics;

public class a2_Pattern {
    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) { // i = rows
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {// j = columns
                row.append("* ");
            }
            System.out.println(row);
        }
    }

    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < i + 1; j++) {
                row.append("* ");
            }
            System.out.println(row);
        }
    }

    public static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < i + 1; j++) {
                row.append(j + 1);
            }
            System.out.println(row);
        }
    }

    public static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < i + 1; j++) {
                row.append(i + 1);
            }
            System.out.println(row);
        }
    }

    public static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n - i; j++) {
                row.append(j + 1);
            }
            System.out.println(row);
        }
    }

    public static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n - i; j++) {
                row.append("* ");
            }
            System.out.println(row);
        }
    }

    public static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            StringBuilder row1 = new StringBuilder();
            for (int j = 0; j < n - 1 - i; j++) {
                row1.append(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                row1.append("*");
            }
            System.out.println(row1);
        }
    }

    public static void pattern8(int n) {
        //1 way of doing this
//        for (int i = 0; i < n; i++) {
//            StringBuilder row = new StringBuilder();
//            for (int j = 0; j < i + 1; j++) {
//                if(j%2 == 0){
//                row.append(1);
//                }else {
//                    row.append(0);
//                }
//            }
//            System.out.println(row);
//        }
        //Another way of doing this
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            int Switch = 1;
            for (int j = 0; j < i + 1; j++) {
                row.append(Switch);
                if (Switch == 1) {
                    Switch = 0;
                } else {
                    Switch = 1;
                }
            }
            System.out.println(row);
        }
    }

    public static void pattern9(int n) {
        int Switch = 1;
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < i + 1; j++) {
                row.append(Switch);
                if (Switch == 1) {
                    Switch = 0;
                } else {
                    Switch = 1;
                }
            }
            System.out.println(row);
        }
    }

    public static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j < n / 2) {
                    System.out.print(" ");
                } else if (i == 0 && j < 2 * n) {
                    System.out.print("*");
                } else if (j == n / 2 || j == 2 * n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if(j < n/2-i){
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < 2*n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 7;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
    }
}
