import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Cookie cookie1 = new Cookie("green");
        Cookie cookie2 = new Cookie("blue");
        LinkedList list = new LinkedList(1);

        cookie1.setColor("orange");
        System.out.println(cookie1.getColor());
        System.out.println(cookie2.getColor());

        list.printList();
        list.getLength();
        list.getHead();
        list.getTail();

        list.append(2);
        list.append(3);
        list.append(4);
        list.printList();
        list.getLength();
        list.getHead();
        list.getTail();

        list.removeLast();
        list.printList();
        list.getLength();
        list.getHead();
        list.getTail();

        list.prepend(0);
        list.printList();
        list.getLength();
        list.getHead();
        list.getTail();

        list.removeFirst();
        list.printList();
        list.getLength();
        list.getHead();
        list.getTail();



    }
}
