package review.linkedlists;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        Node node = new Node(data);
        if(isEmpty()) {
            head = tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void printNodes() {
        Node current = head;
        while(current != null) {
            System.out.print(current.id + "=>");
            current = current.next;
        }
        System.out.println("");
    }

    void deleteById(int id) {
        if(isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        Node previous = head;
        while(current != null) {
            if(current.id == id) {
                if(current == head) {
                    head = current.next;
                    current.next = null;
                }else if(current == tail) {
                    tail = previous;
                    tail.next = null;
                }else {
                    previous.next = current.next;
                    current.next = null;
                }
                size--;

            }
            previous = current;
            current = current.next;

        }
    }

    int indexOf(int id) {
        if(isEmpty()) return -1;
        int position = 0;
        Node current = head;
        while(current != null) {
            if(current.id == id) return position;
            else {
                position++;
                current = current.next;
            }
        }
        return -1;
    }

    void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

    }

}
