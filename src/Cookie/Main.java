package Cookie;

public class Main {

    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("Blue");
        Cookie cookieTwo = new Cookie("Green");
        System.out.println("Cookie One: " + cookieOne.getColor());
        System.out.println("Cookie Two: "+ cookieTwo.getColor());
        cookieOne.setColor("Orange");
        System.out.println("Cookie One: "+ cookieOne.getColor());

    }
}
