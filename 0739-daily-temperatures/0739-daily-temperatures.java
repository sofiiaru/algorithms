class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = 1; i<temperatures.length; i++) {
            while(!stack.empty() && temperatures[i] > temperatures[stack.peek()]) {
                    result[stack.peek()] = i-stack.pop();
                }
            if(temperatures[i]>temperatures[i-1]){
                result[i-1] = 1;
            } else {
                stack.push(i-1);
            }
        }

        return result;
    }
}