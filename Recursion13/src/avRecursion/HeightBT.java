public class HeightBT{
    private class Node{
        int val;
        Node left;
        Node right;
    }

    public static void main(String[] args) {
        
    }

    // height of a binary tree
    public static int heightBinaryTree(Node node){
        if(node == null) return 0;

        int left = heightBinaryTree(node.left);
        int right = heightBinaryTree(node.right);

        return 1 + Math.max(left, right);
    }
}