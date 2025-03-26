class Solution {
    public boolean validMountainArray(int[] arr) {
        int length = arr.length;
        if(length < 3) return false;
        boolean peakFound = false;
        boolean increasingFound = false;
        for(int i = 1; i< length; i++) {
            if(arr[i] == arr[i-1]) return false;
            else if(arr[i] > arr[i-1] && !peakFound) increasingFound = true;
            else if(arr[i] > arr[i-1] && peakFound) return false;
            else if(arr[i] < arr[i-1] && !peakFound) peakFound = true;
        }
        return peakFound && increasingFound;
    }
}