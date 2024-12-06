package review.stacks;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SusnsetTask {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(canSeeSunset(new int[] {3,5,4,4,3,1,3,2}, "WEST")));
    }

    public static int[] canSeeSunset(int[] arr, String direction) {
        Deque<Integer> indexes = new LinkedList<>();
        int maxHeight;
        if(direction.equals("EAST")) {
            maxHeight = arr[arr.length-1];
            for(int i = arr.length-1; i>=0; i--){
                if(i == arr.length-1) indexes.push(i);
                else if(arr[i] > arr[i+1] && arr[i] > maxHeight) {
                    indexes.push(i);
                    maxHeight = arr[i];
                }
            }
        } else if(direction.equals("WEST")) {
            maxHeight = arr[0];
            for(int i = 0; i < arr.length; i++){
                if(i == 0) indexes.push(i);
                else if(arr[i] > arr[i-1] && arr[i] > maxHeight) {
                    indexes.push(i);
                    maxHeight = arr[i];
                }
            }
        }

        int[] result = new int[indexes.size()];
        for(int i = 0; i < result.length; i++) {
            if(direction.equals("EAST")) result[i] = indexes.pop();
            else result[i] = indexes.removeLast();
        }
        return result;
    }
}
