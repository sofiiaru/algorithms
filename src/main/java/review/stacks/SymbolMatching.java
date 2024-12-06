package review.stacks;

import java.util.*;

public class SymbolMatching {
    public static void main(String[] args) {
        System.out.println(symbolMatch("((A+B)+[[a+b]+{a*b}])"));
    }

    public static boolean symbolMatch(String s) {
        Set<Character> setOpen = new HashSet<>(Arrays.asList('(', '[', '{'));
        Set<Character> setClose = new HashSet<>(Arrays.asList(')', ']', '}'));

        Deque<Character> stack = new LinkedList<>();

        for( Character c: s.toCharArray()) {
            if(setOpen.contains(c)) stack.push(c);
            else if(setClose.contains(c)) {
                //check the top of stack to match with opening brace
                if(stack.isEmpty()) return false;
                switch(c){
                    case ')':
                        if(stack.pop() != '(') return false;
                        break;
                    case ']':
                        if(stack.pop() != '[') return false;
                        break;
                    case '}':
                        if(stack.pop() != '{') return false;
                        break;
                }
            }
        }
        return stack.isEmpty();
    }
}
