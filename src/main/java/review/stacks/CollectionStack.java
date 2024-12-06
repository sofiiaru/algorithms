package review.stacks;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();

        stack.push(1);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        Stack<Integer> stack2 = new Stack<>();
        stack.push(12);
        stack.push(15);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

    }
}
