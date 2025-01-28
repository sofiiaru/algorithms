class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;

        for(int n : nums) {
            switch(n){
                case 0: red++; break;
                case 1: white++; break;
                case 2: blue++;
            }
        }

        for(int i = 0;red>0 || white>0 || blue>0;i++){
            if(red>0){
                nums[i] = 0;
                red--;
            }else if(white>0) {
                nums[i] = 1;
                white--;
            }else {
                nums[i] = 2;
                blue--;
            }
            
        }
    }
}