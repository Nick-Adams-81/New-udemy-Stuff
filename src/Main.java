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

        Stack stack = new Stack(1);
        Queue queue = new Queue(9);

        BST myBST = new BST();
        System.out.println("root: " + myBST.root);

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);
        myBST.insert(27);

        System.out.println(myBST.contains(26));

        System.out.println("My bst node: " + myBST.root.left.right.value);



        HashTable myHash = new HashTable();
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");
        graph.addEdge("B", "C");
        graph.addEdge("B", "D");
        graph.printGraph();
        graph.removeEdge("A", "B");
        graph.printGraph();
        graph.removeVertex("D");
        graph.printGraph();



        myHash.set("nails", 100);
        myHash.set("lumber", 80);
        myHash.set("tile", 50);
        myHash.set("bolts", 200);
        myHash.set("screws", 20);
        myHash.printTable();

        System.out.println(myHash.keys());
        System.out.println(myHash.get("bolts"));
        System.out.println(" ");
        queue.printQueue();
        queue.printLength();
        queue.printFirst();
        queue.printLength();

        queue.enqueue(8);
        queue.enqueue(7);
        queue.printQueue();
        queue.printLength();
        queue.printFirst();
        queue.printLast();
        queue.printLength();

        queue.dequeue();
        queue.printQueue();
        queue.printLength();
        queue.printFirst();
        queue.printLast();
        queue.printLength();


        stack.printStack();
        stack.printTop();
        stack.printHeight();

        stack.push(2);
        stack.push(32);
        stack.printStack();
        stack.printTop();
        stack.printHeight();

        stack.pop();
        stack.printStack();
        stack.printTop();
        stack.printHeight();

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

        dll.insert(3, 500);
        dll.printList();
        dll.printHead();
        dll.printTail();
        dll.printLength();

        dll.remove(0);
        dll.printList();
        dll.printHead();
        dll.printTail();
        dll.printLength();




    }
}
