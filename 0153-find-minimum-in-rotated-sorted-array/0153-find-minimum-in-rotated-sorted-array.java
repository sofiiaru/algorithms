class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        if(nums[0]< nums[n-1]) return nums[0];

        int left = 1;
        int right = n-1;

        while(left<=right) {
            int middle = left + (right-left)/2;
            if(nums[middle]<nums[middle-1]) return nums[middle];
            else if(nums[middle]>nums[right]) left = middle+1;
            else right = middle-1;            
        }

        return -1;
        
    }
}