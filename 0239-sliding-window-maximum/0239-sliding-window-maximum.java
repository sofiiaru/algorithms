class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int index = 0;

        for (int i = 0; i < n; i++) {
            // Remove elements from the front if they are out of the window
            if (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }

            // Remove elements from the back if they are smaller than the current element
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // Add the current index to the deque
            dq.offerLast(i);

            // Once we have processed at least `k` elements, add the front of the deque to the result
            if (i >= k - 1) {
                result[index++] = nums[dq.peekFirst()];
            }
        }

        return result;       
    }
}