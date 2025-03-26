class Solution {
    public boolean validMountainArray(int[] arr) {
        int length = arr.length;
        if(length < 3) return false;
        boolean peakFound = false;
        boolean increasingFound = false;
        for(int i = 1; i< length; i++) {
            if(arr[i] == arr[i-1]) return false;
            if(!peakFound) {
                if(arr[i] > arr[i-1]) increasingFound = true;
                else if(arr[i] < arr[i-1])peakFound = true;
            } else {
                if(arr[i] > arr[i-1]) return false;
            }
        }
        return peakFound && increasingFound;
    }
}