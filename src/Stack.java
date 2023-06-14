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

    public void printStack() {
        Node temp = top;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printTop() {
        System.out.println("Top: " + top.value);
    }

    public void printHeight() {
        System.out.println("Height: " + height);
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if(height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop() {
        if(height == 0) return null;
        Node temp = top;
        top = temp.next;
        temp.next = null;
        height--;
        return temp;
    }
}