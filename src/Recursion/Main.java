package Recursion;

public class Main {

    public static void one() {
        two();
        System.out.println("One");

    }

    public static void two() {
        three();
        System.out.println("Two");
    }

    public static void three() {
        System.out.println("Three");
    }

    public static void main(String[] args) {
        one();
    }
}
