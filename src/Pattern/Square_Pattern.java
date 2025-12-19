package Pattern;

public class Square_Pattern {
    public static void pattern(int n){
        for (int i = 0; i < n; i++) { // i = rows
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {// j = columns
                row.append("* ");
            }
            System.out.println(row);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        pattern(n);
    }
}
