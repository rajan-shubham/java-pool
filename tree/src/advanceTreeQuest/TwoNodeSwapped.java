package advanceTreeQuest;
//https://leetcode.com/problems/recover-binary-search-tree/
class Node {
    int val;
    Node left;
    Node right;

    public Node(int val){
        this.val = val;
    }
}

public class TwoNodeSwapped {
    Node first;
    Node second;
    Node prev;

    public void swapFix(Node root){
        iot(root);

        // swap
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    private void iot(Node node){
        if (node == null) return;

        iot(node.left);

        if (prev != null && prev.val > node.val){
            if (first == null) first = prev;
            second = node;
        }
        prev = node;

        iot(node.right);
    }

    /*
    TreeNode prev=null,first=null,second=null;
    void inorder(TreeNode root){
        if(root==null)
            return ;
        inorder(root.left);
        if(prev!=null&&root.val<prev.val){
            if(first==null)
                first=prev;
            second=root;
        }
        prev=root;
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        if(root==null)
            return ;
        inorder(root);
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }
     */
}
