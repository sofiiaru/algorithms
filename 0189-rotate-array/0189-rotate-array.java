class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        if(k > l) k %= l;

        reverse(nums, 0, l-1);    
        reverse(nums, 0,k-1);
        reverse(nums, k, l-1);
    }

    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++; 
            end--;
        }
    }

}