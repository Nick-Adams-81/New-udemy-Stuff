package Trees;

public class BST {

    Node root;

    static class Node {
        int value;
        Node right;
        Node left;
        Node(int value) {
            this.value = value;
        }
    }



    // insert O(log n)
    public boolean insert(int value) {
        Node newNode = new Node(value);
        if(root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true) {
            if(newNode.value == temp.value) return false;
            if(newNode.value < temp.value) {
                if(temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if(temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        Node temp = root;
        while(temp != null) {
            if(temp.value > value) {
                temp = temp.left;
            } else if(temp.value < value){
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }


    // remove O(log n)
    // lookup O(log n)
}
