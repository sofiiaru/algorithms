package review.sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int toBeInserted = arr[i];
            int j = i-1;// teh predecessor
            while(j>=0 && arr[j]>toBeInserted) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = toBeInserted;
        }
    }
}
