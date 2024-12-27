package review.sorting;

import static review.sorting.SelectionSort.swap;

public class QuickSort {

    public static void quickSort(int[] arr, int start, int end) {
        if(start >= end) return; //base condition

        int boundary = partition(arr, start, end);
        quickSort(arr, start,boundary-1);
        quickSort(arr, boundary+1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int boundary = start;
        for(int i = start; i <=end; i++) {
            if(arr[i] < pivot) swap(arr, i, boundary++);
        }
        return boundary;
    }
}
