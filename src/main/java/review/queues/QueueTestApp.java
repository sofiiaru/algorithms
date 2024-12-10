package review.queues;

public class QueueTestApp {
    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<>();
        mq.enqueu(3);
        mq.enqueu(1);
        mq.enqueu(2);

        System.out.println("Size "+mq.size);
        System.out.println("Front "+mq.peek());
        System.out.println("Remove "+mq.dequeue());
    }
}
