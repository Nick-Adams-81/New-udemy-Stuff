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

    public static int factorial(int n) {
        if(n == 1) return 1;
        return n * factorial(n -1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
