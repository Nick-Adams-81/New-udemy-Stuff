package Trees;

import java.util.Arrays;

public class Main {

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length -1;
        while(low <= high) {

            int middle = low + (high - low) / 2;
            int value = arr[middle];

            System.out.println("middle: " + value);

            if(value < target) low = middle + 1;
            else if(value > target) high = middle - 1;
            else return middle;

        }
        return -1;
    }

    public static void main(String[] args) {

        BST tree = new BST();
        System.out.println(tree.root);

        tree.insert(47);
        tree.insert(21);
        tree.insert(76);
        tree.insert(18);
        tree.insert(52);
        tree.insert(82);
        tree.insert(27);


        System.out.println("Breadth first search: " + tree.BFS());
        System.out.println("Depth first search pre order " + tree.DFSPreOrder());
        System.out.println("Depth first search post order: " + tree.DFSPostOrder());
        System.out.println("Depth first search in order: " + tree.DFSInOrder());
        System.out.println(tree.root.left.right.value);
        System.out.println(tree.contains(47));
        System.out.println(tree.contains(4));

        System.out.println(tree.rContains(2));

        tree.rInsert(23);
        System.out.println(tree.rContains(23));

        BST newTree = new BST();
        newTree.rInsert(2);
        newTree.rInsert(1);
        newTree.rInsert(3);
        System.out.println("Root -> : " + newTree.root.value);
        System.out.println("Root -> Left: " + newTree.root.left.value);
        System.out.println("Root -> Right: " + newTree.root.right.value);

        newTree.deleteNode(3);
        System.out.println("Root -> : " + newTree.root.value);
        System.out.println("Root -> Left: " + newTree.root.left.value);
        System.out.println("Root -> Right: " + newTree.root.right);

        int[] array = new int[1000000];
        int target = 720000;

        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int index = binarySearch(array, target);
        if(index == -1) {
            System.out.println(target + " not found");
        } else {
            System.out.println("Target found: " + target);
        }






    }
}
