class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< arr.length; i++) {
            int d = 2*arr[i];
            if(map.keySet().contains(2*arr[i]) && map.get(d) != i) return true;
            else if(arr[i]%2 == 0 && map.keySet().contains(arr[i]/2) && map.get(arr[i]/2) != i) return true;
            else {
                map.put(arr[i], i);
            }
        }
        return false;
        
    }
}