package Queue;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue(2);

        queue.printQueue();
        queue.printFirst();
        queue.printLast();
        queue.printLength();
    }
}
