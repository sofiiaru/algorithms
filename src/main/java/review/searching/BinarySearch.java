package review.searching;

public class BinarySearch {

    public static int binarySearchIterative(int[] arr, int data) {
       int left = 0;
       int right = arr.length-1;
        while (left <= right) {

            int middle = (left+right)/2;
            if(arr[middle] == data) return middle;
            if(data < arr[middle]) right = middle-1;
            else left = middle+1;
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int data) {
        return binarySearchRecursive(arr, data, 0, arr.length-1);
    }

    public static int binarySearchRecursive(int[] arr, int data, int left, int right) {
        if(left > right) return -1;
        int middle = (left+right)/2;
        if(arr[middle] == data) return middle;
        if(data < arr[middle]) binarySearchRecursive(arr, data, left, middle-1);
        else left = binarySearchRecursive(arr, data, middle+1, right);
        return -1;
    }
}
