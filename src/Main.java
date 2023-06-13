import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Cookie cookie1 = new Cookie("green");
        Cookie cookie2 = new Cookie("blue");
        LinkedList list = new LinkedList(1);
        DLL dll = new DLL(1);

        cookie1.setColor("orange");
        System.out.println(cookie1.getColor());
        System.out.println(cookie2.getColor());

        list.printList();
        list.getLength();
        list.getHead();
        list.getTail();

//        list.append(2);
//        list.append(3);
//        list.append(4);
//        list.printList();
//        list.getLength();
//        list.getHead();
//        list.getTail();
//
//        list.removeLast();
//        list.printList();
//        list.getLength();
//        list.getHead();
//        list.getTail();
//
//        list.prepend(0);
//        list.printList();
//        list.getLength();
//        list.getHead();
//        list.getTail();
//
//        list.removeFirst();
//        list.printList();
//        list.getLength();
//        list.getHead();
//        list.getTail();
//
//        System.out.println(list.get(2).value);
//
//        list.set(2, 32);
//        list.printList();
//        list.getLength();
//        list.getHead();
//        list.getTail();
//
//        list.insert(2, 55);
//        list.printList();
//        list.getLength();
//        list.getHead();
//        list.getTail();
//
//        list.remove(3);
//        list.printList();
//        list.getLength();
//        list.getHead();
//        list.getTail();
//
//        list.reverse();
//        list.printList();

        dll.printList();
        dll.printHead();
        dll.printTail();
        dll.printLength();

        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.printList();
        dll.printHead();
        dll.printTail();
        dll.printLength();

        dll.removeLast();
        dll.printList();
        dll.printHead();
        dll.printTail();
        dll.printLength();

        dll.prepend(0);
        dll.printList();
        dll.printHead();
        dll.printTail();
        dll.printLength();

        dll.removeFirst();
        dll.printList();
        dll.printHead();
        dll.printTail();
        dll.printLength();

        System.out.println(dll.get(2).value);

        dll.set(0, 22);
        dll.printList();
        dll.printHead();
        dll.printTail();
        dll.printLength();




    }
}
