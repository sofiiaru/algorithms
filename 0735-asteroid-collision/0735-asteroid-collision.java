class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for(int x : asteroids) {
            if(x > 0) stack.push(x);
            else {
                if(stack.empty()) {
                    list.add(x);
                } else {
                    while(!stack.empty()) {
                        int top = stack.peek();
                        if(Math.abs(x) > top) {
                            stack.pop();
                            if(stack.empty()) list.add(x);
                        } else if(Math.abs(x) == top) {
                            stack.pop();
                            break;
                        } else {
                            break;
                        }
                    }
                    
                }
            }

        }

        int answerSize = list.size() + stack.size();
        int[] answer = new int[answerSize];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        int index = answer.length-1;
        while(!stack.empty()) {
            answer[index] = stack.pop();
            index--;
        }

        return answer;

    }
}