package HashTables;

public class Main {

    public static void main(String[] args) {

        HashTable myHash = new HashTable();
        myHash.printTable();

        myHash.set("nails", 100);
        myHash.set("tile", 50);
        myHash.set("lumber", 80);
        myHash.set("bolts", 200);
        myHash.set("screws", 140);
        myHash.printTable();

        System.out.println(myHash.get("nail"));
    }
}
