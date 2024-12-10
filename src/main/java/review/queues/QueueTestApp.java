package review.queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTestApp <T> {
    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<>();
        mq.enqueu(3);
        mq.enqueu(1);
        mq.enqueu(2);

        System.out.println("Size "+mq.size);
        System.out.println("Front "+mq.peek());
        System.out.println("Remove "+mq.dequeue());

        //test reverse K elem
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(10);
        queue1.add(20);
        queue1.add(30);
        queue1.add(40);queue1.add(50);queue1.add(60);

        Queue<Integer> queue2 = new QueueTestApp().reverseFirstKElements(queue1, 4);

        queue2.stream()
                .forEach(System.out::print);
    }



    public Queue<T> reverseFirstKElements(Queue<T> q, int k) {
        //add first K elements to stack
        Deque<T> stack = new LinkedList<T>();
        while(k>0) {
            stack.push(q.remove());
            k--;
        }
        Queue<T> result = new LinkedList<T>();
        //move elements from stack to a new queue
        while(!stack.isEmpty()) {
            result.add(stack.pop());
        }
        while(!q.isEmpty()) {
            result.add(q.remove());
        }

        return result;
    }
}
