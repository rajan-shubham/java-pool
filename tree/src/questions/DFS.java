package questions;

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

}
