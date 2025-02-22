class Solution {
    public int maxArea(int[] height) {
        int maxHeight = 0;
        int start = 0; 
        int end = height.length-1;

        while(start < end) {
            int h = Math.min(height[start], height[end]);
            int capacity = h*(end-start);
            maxHeight = Math.max(maxHeight, capacity);
            
            if(height[start] < height[end]) start++;
            else end--;
        }

        return maxHeight;        
    }
}