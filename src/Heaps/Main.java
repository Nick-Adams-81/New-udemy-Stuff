package Heaps;

public class Main {

    public static void main(String[] args) {

        Heaps heap = new Heaps();
        Heaps newHeap = new Heaps();

        heap.insert(99);
        heap.insert(72);
        heap.insert(61);
        heap.insert(58);
        System.out.println(heap.getHeap());

        heap.insert(100);
        System.out.println(heap.getHeap());

        heap.insert(75);
        System.out.println(heap.getHeap());

        newHeap.insert(95);
        newHeap.insert(75);
        newHeap.insert(80);
        newHeap.insert(55);
        newHeap.insert(60);
        newHeap.insert(50);
        newHeap.insert(65);

        System.out.println(newHeap.getHeap());
        newHeap.remove();
        System.out.println(newHeap.getHeap());
        newHeap.remove();
        System.out.println(newHeap.getHeap());

    }
}
