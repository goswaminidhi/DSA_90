package DSA_Course.HeapAndPriorityQueue;

import java.util.ArrayList;

public class a1_InsertIntoMinHeap {
    private ArrayList<Integer> heap;

    public a1_InsertIntoMinHeap(){
        heap = new ArrayList<>();
        heap.add(5);
        heap.add(10);
        heap.add(20);
        heap.add(30);
    }

    private int getLeftChild(int i){
        return (2 * i)+1;
    }
    private int getRightChild(int i){
        return (2 * i)+2;
    }

    private int getParentIndex(int i){
        return (i - 1)/2;
    }

    public void insert(int val){
        heap.add(val);
        int lastIndex = heap.size()-1;
        heapifyUp(lastIndex);
    }
    public  void heapifyUp(int i){
        while (i > 0) {
            int parentIndex = getParentIndex(i);
            if (heap.get(i) < heap.get(parentIndex)) {
                // Swap
                int temp = heap.get(parentIndex);
                heap.set(parentIndex, heap.get(i));
                heap.set(i, temp);

                i = parentIndex;
            } else {
                break;
            }
        }
    }
    public void printHeap() {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        a1_InsertIntoMinHeap heap = new a1_InsertIntoMinHeap();
        heap.insert(1);
        heap.printHeap();
    }
}
