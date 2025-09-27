package Heaps;


import java.util.*;


public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }

        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] ans = new int[k];
        int counter = 0;
        for (int i = bucket.length - 1; i >= 0 && counter < k; i--) {
            if(bucket[i] != null){
                for (Integer integer :bucket[i]){
                    ans[counter++] = integer;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(topKFrequent(ans,k));
    }
}
