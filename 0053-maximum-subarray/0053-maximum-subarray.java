class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] prefixSum = new int[n+1];

        for(int i=1; i<=n; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i-1];
        }//[0 -2 -3]

        int answer = Integer.MIN_VALUE;
        int currentMinPrefixSum = prefixSum[0];

        for(int i=1; i<=n; i++) {
            answer = Math.max(answer, prefixSum[i] - currentMinPrefixSum);
            currentMinPrefixSum = Math.min(currentMinPrefixSum, prefixSum[i]);
        }

        return answer;

    }
}