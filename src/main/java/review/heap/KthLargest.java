package review.heap;

import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(getKthLargest(nums, 2));
    }

    public static int getKthLargest(int[] arr, int k) {
        //create a heap
        MyHeap heap = new MyHeap(arr.length);
        //put array into a heap
        Arrays.stream(arr).forEach(i -> heap.insert(i));
        //remove root k-1 times
        while(k > 1) {
            heap.remove();
            k--;
        }
        //return root
       return heap.peek();
    }
}
