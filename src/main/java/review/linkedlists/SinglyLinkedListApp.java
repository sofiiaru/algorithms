package review.linkedlists;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList mylist = new MySinglyLinkedList();

        System.out.println(mylist.isEmpty());

        for(int i =0; i< 10; i++) {
            mylist.add(i+1);
        }

        mylist.printNodes();
    }
}