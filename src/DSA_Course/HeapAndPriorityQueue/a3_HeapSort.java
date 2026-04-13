package DSA_Course.HeapAndPriorityQueue;

public class a3_HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;

        //Step1:Build max heap
        for (int i = n - 1; i >= 0; i--) {
            heapifyDown(arr, i, n);
        }
        //Step2:Sort arr
        for (int i = n - 1; i > 0; i--) {
            // Swap arr[0] with arr[i]
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify root element
            heapifyDown(arr, 0, i);
        }

    }

        private static void heapifyDown ( int[] arr, int i, int n){
            int largest = i;
            int left = (2 * i) + 1;
            int right = (2 * i) + 2;

            if (left < n && arr[left] > arr[largest]) {
                largest = left;
            }

            if (right < n && arr[right] > arr[largest]) {
                largest = right;
            }

            if (largest != i) {
                // Swap
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;

                heapifyDown(arr, largest, n);
            }
        }

    public static void main(String[] args) {
        int[] arr = {6,3,2,67,5};
        heapSort(arr);
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}

