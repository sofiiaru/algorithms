package review.sorting;

import java.util.Arrays;

public class SortingApp {
    public static void main(String[] args) {
        int[] nums = {7, 2, 4, 6, 1, 9, -1};
        SelectionSort.selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
