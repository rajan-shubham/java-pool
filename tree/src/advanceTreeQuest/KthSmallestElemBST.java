package advanceTreeQuest;

import java.util.PriorityQueue;

public class KthSmallestElemBST {
    // find kth smallest or K th something in tree or array --> Use HEAP
    // inOrder traversal gives sorted order elements

    private class TreeNode {
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

//    https://leetcode.com/problems/kth-smallest-element-in-a-bst/submissions/
    private int k;
    private int result;
    public int kthSmallest(TreeNode root, int k){
        this.k = k;
        helper2(root);
        return result;
    }
    private void helper2(TreeNode node){
        if (node == null) return;
        helper2(node.left);
        k--;
        if (k == 0) {
            result = node.val;
            return;
        }
        helper2(node.right);
    }

    public int kthSmallest2(TreeNode root, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        helper(root, minHeap, k);
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans = minHeap.poll();
        }
        return ans;
    }
    private void helper(TreeNode node, PriorityQueue<Integer> minHeap, int k){
        if (node == null) return;
        helper(node.left, minHeap, k);
        minHeap.offer(node.val);
        helper(node.right, minHeap, k);
    }

    /* 0 ms runtime
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
         if(root == null){
            return -1;
        }

        int left = kthSmallest(root.left, k);
        if(left != -1){
            return left;
        }

        count ++ ;
        if(count == k){
            return root.val;
        }

        return kthSmallest(root.right, k);
    }
     */

    /* 1ms runtime
    ArrayList<Integer> list = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        // if (root == null) return 0;

        filler(root);

        return list.get(k-1);
    }

    public void filler(TreeNode root){
        if (root == null) return ;
        filler(root.left);
        list.add(root.val);
        filler(root.right);
    }
     */
}
