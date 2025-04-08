class Solution {
    public boolean isValid(String s) {
        Set<Character> open = new HashSet<>(Arrays.asList('(', '{', '[' ));

        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(open.contains(c)) stack.push(c);
            else {
                if(stack.empty()) return false;
                char top = stack.pop();
                switch(c){
                    case ')': 
                         if (top == '(') break;
                         else return false;        
                    case '}': 
                        if (top == '{') break;
                        else return false;
                    case ']': 
                        if (top == '[') break;
                        else return false;
                }
            }
        }

        return stack.empty();
        
    }
}