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

        myDLL.removeFirst();
        myDLL.printList();
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);
        System.out.println(myDLL.get(2).value);
    }
}
