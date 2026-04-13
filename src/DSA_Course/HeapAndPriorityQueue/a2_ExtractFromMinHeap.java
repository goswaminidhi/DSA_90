package DSA_Course.HeapAndPriorityQueue;

import java.util.ArrayList;

public class a2_ExtractFromMinHeap {
    private ArrayList<Integer> heap;

    public a2_ExtractFromMinHeap() {
        heap = new ArrayList<>();
        heap.add(5);
        heap.add(10);
        heap.add(20);
        heap.add(30);
    }

    private int getLeftChildIndex(int i) {
        return (2 * i) + 1;
    }

    private int getRightChildIndex(int i) {
        return (2 * i) + 2;
    }

    private int getParentIndex(int i) {
        return (i - 1) / 2;
    }

    public void insert(int val) {
        heap.add(val);
        int lastIndex = heap.size() - 1;
        heapifyUp(lastIndex);
    }

    private void heapifyUp(int i) {
        while (i > 0) {
            int parentIndex = getParentIndex(i);
            if (heap.get(i) < heap.get(parentIndex)) {
                swap(i, parentIndex);
                i = parentIndex;
            } else {
                break;
            }
        }
    }

    public Integer extract() {
        if (heap.size() < 1) return null;

        int min = heap.get(0);
        int lastIndex = heap.size() - 1;

        swap(0, lastIndex);
        heap.remove(lastIndex);

        heapifyDown(0);

        return min;
    }

    private void heapifyDown(int i) {
        int left = getLeftChildIndex(i);
        int right = getRightChildIndex(i);
        int n = heap.size();

        int smallest = i;

        if (left < n && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }

        if (right < n && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            heapifyDown(smallest);
        }
    }

    public Integer peek() {
        if (heap.isEmpty()) return null;
        return heap.get(0);
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }


    public void printHeap() {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        a2_ExtractFromMinHeap heap = new a2_ExtractFromMinHeap();

        heap.insert(5);
        heap.insert(20);
        heap.insert(4);
        heap.insert(10);
        heap.insert(1);
        heap.insert(0);

        System.out.println(heap.peek());     // smallest element
        System.out.println(heap.extract());  // remove min
        System.out.println(heap.extract());  // remove next min
        heap.printHeap();
    }
}
