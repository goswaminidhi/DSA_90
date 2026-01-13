package DSA_Course.StackAndQueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class a1_MyStack {
    ///Using 2 queue
    static Queue<Integer> q1;
    static Queue<Integer> q2;
    public a1_MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public static void push(int x) {
        q1.add(x);
    }

    public static int pop() {
        int size = q1.size();
        for (int i = 0; i < size - 1; i++) {
            q2.add(q1.poll());
        }
        Integer remove = q1.poll();
        Queue<Integer> help = q1;
        q1 = q2;
        q2 = help;
        return remove;
    }

    public static int top() {
        int size = q1.size();
        for (int i = 0; i < size - 1; i++) {
            q2.add(q1.poll());
        }
        Integer top = q1.poll();
        q2.offer(top);
        Queue<Integer> help = q1;
        q1 = q2;
        q2 = help;
        return top;
    }

    public static boolean empty() {
        if(q1.size() == 0){
            return true;
        }
        return false;
    }

}
