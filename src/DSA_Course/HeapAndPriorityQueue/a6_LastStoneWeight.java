package DSA_Course.HeapAndPriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class a6_LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < stones.length; i++) {
            pq.offer(stones[i]);
        }
        while (pq.size() > 1){
            int x = pq.poll();
            int y = pq.poll();
            if((x - y) > 0){
                pq.offer(x-y);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }else {
            return pq.peek();
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,7,4,1,8,1};
        int[] arrs = {3,7,8};
        System.out.println(lastStoneWeight(arrs));
    }
}
