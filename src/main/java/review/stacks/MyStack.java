package review.stacks;

import java.util.NoSuchElementException;

public class MyStack<T> {
    public SNode<T> bottom;
    public SNode<T> top;
    int size;

    public boolean isEmpty(){
        return bottom == null;
    }

    public void push(T item) {
        SNode<T> snode = new SNode<>(item);
        if(isEmpty()) bottom = top = snode;
        else {
            top.next = snode;
            top = snode;
        }
        size++;
    }

    public T peek (){
        return (T) top.value;
    }

    public T pop() {
        SNode<T> peekNode;
        if(isEmpty()) throw new NoSuchElementException("Stack is empty");
        else {
            peekNode = top;
            //case 1: stack has 1 element
            if(top == bottom) {
                top = bottom = null;
            }else {
                //case 2: more than 1 element
                SNode previous = bottom;
                while(previous.next != top) {
                    previous = previous.next;

                }
                previous.next = null;
                top = previous;
            }
            size--;
        }
        return (T) peekNode.value;
    }
}
