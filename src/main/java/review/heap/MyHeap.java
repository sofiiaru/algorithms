package review.heap;

import java.util.NoSuchElementException;

public class MyHeap {
    int[] items;
    int size;

    public MyHeap(int capacity) {
        this.items = new int[capacity];
        this.size = 0;
    }

    public void insert(int value) {
        if(size == items.length) throw new RuntimeException("Heap is full");
        items[size++] = value;
        bubbleUp();
    }

    public void bubbleUp() {
        //calculate the starting index
        int index = size-1;
        //while index > 0 and parent < child
        //1. swap the parent and child
        //2.calculate the next index - parent index

        while (index > 0 && items[index] > items[parentIndex(index)]) {
            swap(index, parentIndex(index));
            index = parentIndex(index);
        }
    }

    public int remove() {
        if(size == 0) throw new NoSuchElementException("Heap is empty");

        int result = items[0];
        items[0] = items[--size];
        bubbleDown();
        return result;
    }

    public void bubbleDown() {
        int index = 0;
        //while index < size and parent < larger child
        while(index <= size && !isValidParent(index)) {
            int largerChildIndex = largerChildIndex(index);
            swap(index, largerChildIndex);
            index = largerChildIndex;
        }
    }

    public void printHeap(){
        for(int i = 0; i< size; i++) {
            System.out.println(items[i]+" ");
        }
    }

    public int leftChildIndex( int parentIndex) { return parentIndex*2+1;}
    public int rightChildIndex( int parentIndex) { return parentIndex*2+2;}
    public int parentIndex( int childIndex) { return (childIndex-1)/2;}
    public boolean hasLeftChild(int index) { return leftChildIndex(index) < size;}
    public boolean hasRightChild(int index) { return rightChildIndex(index) < size;}
    public int peek(){
        return items[0];
    }
    public int largerChildIndex(int index) {
        //no child
        if(!hasLeftChild(index)) return index;
        //no right child
        else if(!hasRightChild(index)) return leftChildIndex(index);
        else return (items[leftChildIndex(index)] > items[rightChildIndex(index)])? leftChildIndex(index): rightChildIndex(index);
    }

    public void swap(int first, int second) {
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    public boolean isValidParent(int index) {
        //no children
        if(!hasLeftChild(index)) return true;
        else {
          return items[index] >= items[leftChildIndex(index)]? (!hasRightChild(index) || items[index] >= items[rightChildIndex(index)]? true: false): false;
        }
    }
}
