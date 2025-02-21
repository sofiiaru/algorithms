class Solution {
    public int compress(char[] chars) {
        int nextIndex = 0;

        for(int i = 0, j = i+1; i< chars.length; j++){
            int count = 1;

            while(j < chars.length && chars[i]==chars[j]) {
                count++;
                j++;
            }
            chars[nextIndex++] = chars[i];
            if(count > 1 && count < 10) chars[nextIndex++] = Character.forDigit(count, 10);
            else if(count >= 10) {
                Deque<Integer> stack = new ArrayDeque<Integer>();
                while(count > 0){
                    stack.push(count%10);
                    count/=10;
                }
                while(!stack.isEmpty()){
                    chars[nextIndex++] = Character.forDigit(stack.pop(), 10);
                }
            }
            i=j;
        }
        return nextIndex;
 
    }
}