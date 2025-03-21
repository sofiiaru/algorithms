class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 1;
        while(fast < nums.length) {
            if (nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];
                fast++;
            }else{
                fast++;
            }
        }
        return ++slow;
        
    }
}