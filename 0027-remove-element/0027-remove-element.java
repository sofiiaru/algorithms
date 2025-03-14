class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0, j = nums.length -1; i<=j;) {
            if(nums[i] != val) {
                k++;
                i++;
            }else {
                if(nums[j] == val) j--;
                else {
                    int temp = nums[i];
                    nums[i++] = nums[j];
                    nums[j--] = temp;
                    k++;
                }

            }
        }
        return k;
    }
}//[3,2,2,3]