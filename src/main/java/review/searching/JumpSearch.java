package review.searching;

public class JumpSearch {

    public static int jumpSearch( int[] arr, int data) {
        int blockSize = (int)Math.sqrt(arr.length);

        int start = 0;
        int next = blockSize;

        while(start < arr.length && data > arr[next-1]) {
            start = next;
            next = Math.min(next+blockSize, arr.length);
        }

        for(int i = start; i < next; i++) {
            if(arr[i] == data) return i;
        }

        return -1;
    }
}
