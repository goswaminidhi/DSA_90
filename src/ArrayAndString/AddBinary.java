package ArrayAndString;

public class AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int  carry = 0;
        int base = 2;
        int i = a.length()-1;
        int j = b.length()-1;
        while (i >= 0 || j >= 0){
            int t1 = 0;
            int t2 = 0;
            int sum = 0;
            if(i >= 0){
                t1 = a.charAt(i--) - '0';
            }
            if(j >= 0){
                t2 = b.charAt(j--) - '0';
            }
            sum = t1+t2+carry;
            if(sum >= base){
                carry = 1;
                sum = sum - base;
            }else {
                carry = 0;
            }
             ans.append(sum);
        }
        if(carry == 1){
            ans.append(carry);
        }
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "1";
        String b = "111";
        System.out.println(addBinary(a,b));
    }
}
