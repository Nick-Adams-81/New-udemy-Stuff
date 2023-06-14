public class Queue {

    private int length;
    private Node first;
    private Node last;


    class Node {
        int value;
        Node next;

        Node(int value) {
        this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue() {
        Node temp = first;
        while(temp.next != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printFirst() {
        System.out.println("First: " + first.value);
    }

    public void printLast() {
        System.out.println("Last: " + last.value);
    }


}
