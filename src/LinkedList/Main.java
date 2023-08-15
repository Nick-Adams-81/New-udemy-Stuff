package LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);
        LinkedList newLL = new LinkedList(1);

        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.removeLast();
        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.prepend(2);
        myLinkedList.prepend(3);
        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.removeFirst();
        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println(myLinkedList.get(1).value);

        myLinkedList.set(1, 500);
        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.insert(2, 25);
        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.remove(2);
        myLinkedList.remove(1);
        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.reverse();
        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();


        myLinkedList.append(7);
        myLinkedList.append(12);
        myLinkedList.append(23);
        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        System.out.println("Middle node: " + myLinkedList.findMiddleNode().value);

        newLL.append(2);
        newLL.append(3);
        newLL.append(4);
        newLL.append(5);

        newLL.printList();

        boolean result = newLL.hasLoop();
        System.out.println(result);

        newLL.getHead();
        System.out.println(newLL.findKthFromEnd(3).value);



    }
}
