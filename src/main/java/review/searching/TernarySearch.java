package review.searching;

public class TernarySearch {

    public static int ternarySearchIterative(int[] arr, int data) {
        int left = 0;
        int right = arr.length-1;

        while(left<=right) {
            int partitionSize = (right-left)/3;
            int mid1 = left+partitionSize;
            int mid2 = right - partitionSize;

            if(data == arr[mid1]) return mid1;
            else if(data == arr[mid2]) return mid2;
            else if(data < arr[mid1]) right = mid1-1;
            else if(data > arr[mid2]) left = mid2+1;
            else {
                left = mid1+1;
                right = mid2-1;
            }
        }
        return -1;
    }

    public static int ternarySearchRecursive(int[] arr, int data, int left, int right) {
        if(left > right) return -1;
        int partitionSize = (right-left)/3;
        int mid1 = left+partitionSize;
        int mid2 = right - partitionSize;

        if(data == arr[mid1]) return mid1;
        else if(data == arr[mid2]) return mid2;

        else if(data < arr[mid1]) return ternarySearchRecursive(arr, data, left, mid1-1);
        else if(data > arr[mid2]) return ternarySearchRecursive(arr, data, mid2+1, right);
        else return ternarySearchRecursive(arr, data, mid1+1, mid2-1);

    }
}
