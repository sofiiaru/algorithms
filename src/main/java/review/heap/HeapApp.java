package review.heap;

public class HeapApp {
    public static void main(String[] args) {
        MyHeap heap = new MyHeap(10);
        heap.insert(61);
        heap.insert(120);
        heap.insert(52);
        heap.insert(45);
        heap.insert(81);

        System.out.println("Heap created");
        heap.printHeap();
        heap.remove();
        System.out.println("Heap after removing 120");
        heap.printHeap();
        heap.insert(128);
        System.out.println("Heap after adding 128");
        heap.printHeap();

    }
}
