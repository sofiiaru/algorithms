class Node {
    int val;
    Node next;
    Node prev;

    public Node (int val, Node next, Node prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
class MyCircularDeque {
    Node head,tail;
    int size, capacity;


    public MyCircularDeque(int k) {
        this.capacity = k;
        this.size = 0;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        if(isEmpty()) {
            Node node = new Node(value, null, null);
            head = node;
            tail = head;
        } else {
            Node node = new Node(value, head, null);
            head.prev = node;
            head = node;
        }
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        if(isEmpty()) {
            Node node = new Node(value, null, null);
            head = node;
            tail = node;
        } else {
            Node node = new Node(value, null, tail);
            tail.next = node;
            tail = node;
        }
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        if(head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        if(head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()) return -1;
        else return head.val;
    }
    
    public int getRear() {
        if(isEmpty()) return -1;
        else return tail.val;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */