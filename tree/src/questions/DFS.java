package questions;

import java.util.*;

public class DFS {
    //      Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

//    https://leetcode.com/problems/diameter-of-binary-tree/
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter - 1;
    }
    int height(TreeNode node){
        if (node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(diameter, dia);

        return Math.max(leftHeight, rightHeight) + 1;
    }

//    https://leetcode.com/problems/invert-binary-tree/
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode node = root;

        invertTree(node.left);
        invertTree(node.right);

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        return node;
    }
    /* by kunal
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
     */

//    https://leetcode.com/problems/maximum-depth-of-binary-tree/
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    //    https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
    private TreeNode root;
    public TreeNode sortedArrayToBST(int[] nums) {
        populateSorted(nums);
        return root;
    }
    public void insert(int value){
        root = insert(value, root);
    }
    private TreeNode insert(int value, TreeNode node){
        if(node == null){
            node = new TreeNode(value);
            return node;
        }

        if(value < node.val){
            node.left = insert(value, node.left);
        }

        if (value > node.val){
            node.right = insert(value, node.right);
        }

        return node;
    }
    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length);
    }
    private void populateSorted(int[] nums, int start, int end){
        if (start >= end){
            return;
        }
        int mid = (start + end)/2;

        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }

//    https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
    public void flatten(TreeNode root){
        TreeNode current = root;
        while (current != null){
            if (current.left != null){
                TreeNode temp = current.left;
                while (temp.right != null){
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }

    public boolean isValidBST(TreeNode root){
        return helper(root, null, null);
    }
    public boolean helper(TreeNode node, Integer low, Integer high){
        if (node == null) return true;

        if (low != null && node.val <= low) return false;

        if (high != null && node.val >= high) return false;

        boolean leftTree = helper(node.left, low, node.val);
        boolean rightTree = helper(node.right, node.val, high);

        return leftTree && rightTree;
    }

//    https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) return root;

        return left == null ? right : left;
    }


//    https://leetcode.com/problems/kth-smallest-element-in-a-bst/
//    by shubham 1ms runtime O(n) space and time
    ArrayList<Integer> list = new ArrayList<>();

    public int kthSmallest1ms(TreeNode root, int k) {

        filler(root);

        return list.get(k-1);
    }

    public void filler(TreeNode root){
        if (root == null) return ;
        filler(root.left);
        list.add(root.val);
        filler(root.right);
    }
    // 0ms runtime
    int count = 0;
    public int kthSmallest0ms(TreeNode root, int k) {
        if(root == null){
            return -1;
        }

        int left = kthSmallest0ms(root.left, k);
        if(left != -1){
            return left;
        }

        count ++ ;
        if(count == k){
            return root.val;
        }

        return kthSmallest0ms(root.right, k);
    }

//    https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder.length == 0) {
            return null;
        }

        int r = preorder[0];
        int index = 0;

        for(int i=0; i<inorder.length; i++) {
            if(inorder[i] == r) {
                index = i;
            }
        }

        TreeNode node = new TreeNode(r);

        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));

        return node;

    }

}
