package DSA_Course.HeapAndPriorityQueue;

import java.util.PriorityQueue;

public class a5_KthLargestElementInStream {
    PriorityQueue<Integer> heap;
    private int k;
    public void KthLargest(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        heap.offer(val);
        if(heap.size() > k){
            heap.poll();
        }
        return heap.peek();
    }
}
