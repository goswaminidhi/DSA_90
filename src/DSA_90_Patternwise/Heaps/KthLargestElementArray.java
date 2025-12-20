package DSA_90_Patternwise.Heaps;
import java.util.PriorityQueue;

//This solution is not Optimal Right Now.

public class KthLargestElementArray {
    public static   int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            priorityQueue.offer(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if(nums[i] > priorityQueue.peek()){
                priorityQueue.poll();
                priorityQueue.offer(nums[i]);
            }
        }
        return priorityQueue.peek();
    }

    public static void main(String[] args) {

        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(arr,k));
    }
}
