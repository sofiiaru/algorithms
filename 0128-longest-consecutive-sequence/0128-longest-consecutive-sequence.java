class Solution {
    public int longestConsecutive(int[] nums) {
        //O(n) --> sorting prohibited
        Set<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(n -> set.add(n));

        int longest_streak = 0;

        for( int n : set) {
            if(!set.contains(n-1)) {
                int streak_start = n;
                int streak_end = n;

                while(set.contains(streak_end+1)){
                    streak_end++;
                }

                longest_streak = Math.max(longest_streak, streak_end-streak_start+1);
            }
        }
        return longest_streak;
    }
}