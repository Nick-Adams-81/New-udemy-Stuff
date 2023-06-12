public class Main {

    public static void main(String[] args) {
        Cookie cookie1 = new Cookie("green");
        Cookie cookie2 = new Cookie("blue");

        cookie1.setColor("orange");

        System.out.println(cookie1.getColor());
        System.out.println(cookie2.getColor());
    }
}
