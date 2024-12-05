package review.linkedlists;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList mylist = new MySinglyLinkedList();

        System.out.println(mylist.isEmpty());

        for(int i =0; i< 10; i++) {
            mylist.add(i+1);
        }

        mylist.printNodes();

        mylist.deleteById(7);
        mylist.printNodes();
        mylist.deleteById(1);
        mylist.printNodes();
        mylist.addFirst(-1);
        mylist.printNodes();
        System.out.println(mylist.getKthItemFromEnd(2));
        mylist.removeKthItemFromEnd(2);
        mylist.printNodes();

    }
}
