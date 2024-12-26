package review.searching;

public class ExponentialSearch {

    public static int exponentialSearch(int[] arr, int data) {
        int bound = 1;
        while(bound < arr.length && arr[bound] < data) bound*=2;
        int left = bound/2;
        int right = Math.min(bound, arr.length-1);

        BinarySearch.binarySearchRecursive(arr, data, left, right);
        return -1;
    }
}
