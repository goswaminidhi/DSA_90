package DSA_Course.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

//Using 1 queue
public class a1_MyStack2 {
    static Queue<Integer> q1;
    public a1_MyStack2() {
        q1 = new LinkedList<>();

    }

    public static void push(int x) {
        q1.add(x);
    }

    public static int pop() {
        int size = q1.size();
        for (int i = 0; i < size - 1; i++) {
            q1.offer(q1.poll());
        }
        return q1.poll();
    }

    public static int top() {
        int size = q1.size();
        for (int i = 0; i < size - 1; i++) {
            q1.offer(q1.poll());
        }
        int top = q1.poll();
        q1.offer(top);

        return top;
    }

    public static boolean empty() {
        if(q1.size() == 0){
            return true;
        }
        return false;
    }
}
