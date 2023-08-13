package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }


    // append method: O(1)
    // remove last: O(n)
    // prepend method: O(1)
    // remove first: O(1)
    // insert : O(n)
    // remove item: O(n)
    // find by value: O(n)

}
