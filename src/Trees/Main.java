package Trees;

public class Main {

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


        System.out.println(tree.BFS());
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



    }
}
