package DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
        DLL myDLL = new DLL(1);

        myDLL.printList();
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.append(2);
        myDLL.printList();
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.removeLast();
        myDLL.printList();
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.prepend(0);
        myDLL.append(2);
        myDLL.printList();
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
    }
}
