package Pointers;

import java.util.HashMap;

public class Main {



    public static void main(String[] args) {
        // non pointer
        int num1 = 11;
        int num2 = num1;
        num1 = 22;
        System.out.println("Num  1: " + num1);
        System.out.println("Num  2: " + num2);

        // using pointer
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2;
        map1.put("Value ", 11);
        map2 = map1;
        map1.put("Value", 22);

        System.out.println(map1);
        System.out.println(map2);


    }
}
