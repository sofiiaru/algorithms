class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        
        Stack<Integer> left_indeces = new Stack<>();
        Stack<Integer> asterisk_indeces = new Stack<>();

        for(int i=0; i<n; i++) {
            if(s.charAt(i) == '(') {
                left_indeces.push(i);
            } else if(s.charAt(i) == '*') {
                asterisk_indeces.push(i);
            }else {
                if(!left_indeces.isEmpty()) left_indeces.pop();
                else if(!asterisk_indeces.isEmpty()) asterisk_indeces.pop();
                else return false;
            }
        }

        while(!left_indeces.isEmpty()) {
            if(!asterisk_indeces.isEmpty() && asterisk_indeces.peek() > left_indeces.peek()) {
                asterisk_indeces.pop();
                left_indeces.pop();
            } else return false;
        }
       
       return true;
        
    }
}