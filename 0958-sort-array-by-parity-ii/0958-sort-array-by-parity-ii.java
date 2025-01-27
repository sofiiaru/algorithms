class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;

        while(j<nums.length){
            
            if((isEven(i) && isEven(nums[i])) || 
            (!isEven(i) && !isEven(nums[i]))) {
                i++;j++;
            }
            else if(isEven(i)){
                if(isEven(nums[j])) {
                    int temp = nums[i];
                    nums[i++] = nums[j];
                    nums[j] = temp;
                    j=i+1;
                }else j++;
            }
            else {
                if(!isEven(nums[j])) {
                    int temp = nums[i];
                    nums[i++] = nums[j];
                    nums[j] = temp;
                    j=i+1;
                }else j++;
            }
        } 
        return nums;     
    }

    public boolean isEven(int i){
        return i%2 == 0? true:false;
    }
 
}