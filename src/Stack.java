public class Stack {

    private int height;
    private Node top;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

    }

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }


}
