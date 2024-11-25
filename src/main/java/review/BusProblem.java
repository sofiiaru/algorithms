package review;

import java.util.ArrayList;
import java.util.List;

public class BusProblem {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{5,0});
        list.add(new int[]{3,2});
        list.add(new int[]{6,4});
        list.add(new int[]{0,3});
        System.out.println(busProblem(list));
    }

    public static int busProblem(List<int[]> list) {
        int result = 0;

        for( int[] a : list) {
            result= result+a[0]-a[1];
        }

        return result;
    }
}
