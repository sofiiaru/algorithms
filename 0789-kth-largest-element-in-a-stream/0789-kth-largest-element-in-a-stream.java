class KthLargest {
    PriorityQueue<Integer> topK;
    int capacity;
    public KthLargest(int k, int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;//1
        capacity = k;//2
        topK = new PriorityQueue(capacity);

        for(int i = n-1; i>= Math.max(0,n-k); i--) {
            topK.offer(nums[i]);//0
        }
    }
    
    public int add(int val) {
        if(topK.size() < capacity) {
            topK.offer(val);
        } else if(val > topK.peek()) {
            topK.poll();
            topK.offer(val);
        }
        return topK.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */