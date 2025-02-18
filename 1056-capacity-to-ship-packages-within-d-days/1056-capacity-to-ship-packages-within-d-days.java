class Solution {
    public int shipWithinDays(int[] weights, int days) {
        //min capacity = max weight
        //max capacity = sum of weights
        int min = 0;
        int max = 0;
        int answer = -1;

        for(int w : weights) {
            max+=w;
            min = Math.max(min, w);
        }

        while (min <=max) {
            int middle =(min+max)/2;
            //check how many days is needed if middle capacity is used
            int cur_days = 1;
            int cur_capacity = 0;
            for (int w : weights) {
                if(cur_capacity + w > middle){
                    cur_days++;
                    cur_capacity = w;
                } else {
                    cur_capacity += w;
                }
            }

            if(cur_days > days) min = middle+1;
            else {
                answer = middle;
                max = middle-1;
            }

        }
        return answer;
        
    }
}