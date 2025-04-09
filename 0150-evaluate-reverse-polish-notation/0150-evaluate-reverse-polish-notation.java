class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        int op1, op2;

        for(String token: tokens) {
            if(token.equals("+")) {
                op2 = stack.pop();
                op1 = stack.pop();
                stack.push(op1+op2);
            } else if(token.equals("-")) {
                op2 = stack.pop();
                op1 = stack.pop();
                stack.push(op1-op2);
            } else if(token.equals("*")) {
                op2 = stack.pop();
                op1 = stack.pop();
                stack.push(op1*op2);
            } else if(token.equals("/")) {
                op2 = stack.pop();
                op1 = stack.pop();
                stack.push(op1/op2);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }  
        return stack.pop();     
    }
}