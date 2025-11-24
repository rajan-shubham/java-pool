package infosysPractice65;

public class TreeTraversal {
    /*
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    */

    /* preOrder traversal
    https://leetcode.com/problems/binary-tree-preorder-traversal/
    public ArrayList<Integer> preOrder(Node root) {
        if(root == null) return new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        preOrder(root, result);
        return result;
     }
     private void preOrder(Node root, ArrayList<Integer> result){
         if(root == null) return;
         result.add(root.data);
         preOrder(root.left, result);
         preOrder(root.right, result);
        }
    */

    /* inOrder tree traversal
    https://leetcode.com/problems/binary-tree-inorder-traversal/description/
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        inOrder(root, al);
        return al;
    }
    private void inOrder(Node node, ArrayList<Integer> result){
        if(node == null) return;
        inOrder(node.left, result);
        result.add(node.data);
        inOrder(node.right, result);
    }
     */

    /* postOrder tree traversal
    https://leetcode.com/problems/binary-tree-postorder-traversal/
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
       traverse(res,root);
       return res;
    }
    public static void traverse(ArrayList<Integer> res,Node root){
        if(root == null) return;

        traverse(res,root.left);
        traverse(res,root.right);
        res.add(root.data);
    }
     */


    /* https://www.geeksforgeeks.org/problems/serialize-and-deserialize-a-binary-tree/1
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
    import java.util.*;
    class Solution {
        public ArrayList<Integer> serialize(Node root) {
            // code here
            ArrayList<Integer> al = new ArrayList<Integer>();
            serial(root, al);
            return al;
        }
        private void serial(Node node, ArrayList<Integer> list){
            if(node == null){
                list.add(0);
                return;
            }
            list.add(node.data);
            serial(node.left, list);
            serial(node.right, list);
        }

        public Node deSerialize(ArrayList<Integer> arr) {
            Collections.reverse(arr);
            return deSerial(arr);
        }
        private Node deSerial(ArrayList<Integer> arr){
            Integer num = arr.remove(arr.size() - 1);
            if(num == 0) return null;
            Node node = new Node(num);
            node.left = deSerial(arr);
            node.right = deSerial(arr);
            return node;
        }
    };
    */
}
