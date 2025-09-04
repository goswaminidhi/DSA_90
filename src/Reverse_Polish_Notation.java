import java.util.Stack;

public class Reverse_Polish_Notation {
    public static int evalRPN(String[] tokens) {
        int ans = 0;
        Stack<String> stack = new Stack<>();
        int num = 0;
        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            if(s.matches("\\d+")){
                stack.push(s);
            }else {
                int exp = 0;
                while(num !=2){
                    exp = Integer.parseInt(stack.pop());
                    num++;
                }
                stack.push(String.valueOf(exp));
            }
            System.out.println(stack);
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] arr = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(arr));
    }
}
