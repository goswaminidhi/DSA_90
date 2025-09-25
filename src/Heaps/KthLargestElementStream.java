package Heaps;

import java.util.PriorityQueue;


//This solution is not optimal yet

public class KthLargestElementStream {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    private int k ;
    public void KthLargest(int k, int[] nums) {
        this.k = k;
        for (int num: nums) {
            pq.offer(nums[num]);
            if(pq.size() > k){
                pq.poll();
            }
        }
    }

    public int add(int val) {
        if(pq.size() < k){
            pq.add(val);
            return pq.peek();
        }
        pq.add(val);
        pq.poll();
        return pq.peek();

    }

    public static void main(String[] args) {
        int[] nums = {4,5,8,2};
        int k = 3;
        System.out.println();
    }
}
