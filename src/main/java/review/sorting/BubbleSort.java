package review.sorting;

import static review.sorting.SelectionSort.swap;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i< arr.length; i++) {
            boolean swap = false;
            for(int j = 0; j< arr.length-1; j++) {
                if(arr[j] >arr[j+1]) {
                    swap(arr, j, j+1);
                    swap = true;
                }
            }
            if(!swap) return;
        }
    }
}
