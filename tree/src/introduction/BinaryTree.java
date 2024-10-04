package introduction;

public class BinaryTree {
    public BinaryTree() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public static void main(String[] args) {
        Node n = new Node(5);
        System.out.println(n.value);
    }
}
