package questions;

import com.sun.source.tree.Tree;

import java.util.*;

public class BFS {

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

    // https://leetcode.com/problems/binary-tree-level-order-traversal/
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lot = new ArrayList<>();

        if(root == null){
            return lot;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for(int i=0; i<levelSize; i++){
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            lot.add(currentLevel);
        }
        return lot;
    }

    // 0ms runtiome BFS
    /*
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        build(root, 0, result);
        return result;
    }

    private void build(TreeNode node, int level, List<List<Integer>> result) {
        if (node == null) return;

        if (level == result.size()) result.add(new ArrayList<>());

        result.get(level).add(node.val);

        build(node.left, level + 1, result);
        build(node.right, level + 1, result);
    }
     */

//    https://leetcode.com/problems/binary-tree-right-side-view/description/
    public List<Integer> rightSideView(TreeNode root) {
    List<Integer> result = new ArrayList<>();

    if (root == null) {
      return result;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      int levelSize = queue.size();

      for (int i=0; i < levelSize; i++) {
        TreeNode currentNode = queue.poll();

        if (i == levelSize - 1) {
          result.add(currentNode.val);
        }
        
        if (currentNode.left != null) {
          queue.offer(currentNode.left);
        }
        if (currentNode.right != null) {
          queue.offer(currentNode.right);
        }
      }
    }
    return result;
  }

  // https://leetcode.com/problems/average-of-levels-in-binary-tree/
    // 2ms runtime
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            double levelSum = 0;
            for(int i = 0; i<levelSize; i++){
                TreeNode currentNode = queue.poll();
                levelSum += currentNode.val;
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(levelSum/levelSize);
        }

        return result;
    }

    // 1ms runtime
    // Method 2 : DFS with Recursion & arrayList countOfLevels
    /* class Solution {

        private final List<Double> averageOfLevels = new ArrayList<>();
        private final List<Integer> countsOfLevels = new ArrayList<>();

        public List<Double> averageOfLevels(TreeNode root) {
            averageOfLevels(root, 0);
            for (int i = 0; i < averageOfLevels.size(); i++) {
                averageOfLevels.set(i, averageOfLevels.get(i) / countsOfLevels.get(i));
            }
            return averageOfLevels;
        }

        private void averageOfLevels(TreeNode node, int level) {
            if (node == null) return;
            if (level < averageOfLevels.size()) {
                averageOfLevels.set(level, averageOfLevels.get(level) + node.val);
                countsOfLevels.set(level, countsOfLevels.get(level) + 1);
            } else {
                averageOfLevels.add((double) node.val);
                countsOfLevels.add(1);
            }

            level++;
            averageOfLevels(node.left, level);
            averageOfLevels(node.right, level);
        }
    } */


    // to find the successor of a node value in level order traversal
    public TreeNode findSuccessor(TreeNode root, int key){
        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            if (currentNode.left != null){
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null){
                queue.offer(currentNode.right);
            }
            if (currentNode.val == key) break;
        }

        return queue.peek();
    }

//    https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/submissions/1454146169/
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean reverse = false;

        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                if (!reverse){
                    TreeNode currentNode = queue.pollFirst();
                    currentLevel.add(currentNode.val);
                    if (currentNode.left != null){
                        queue.addLast(currentNode.left);
                    }
                    if (currentNode.right != null){
                        queue.addLast(currentNode.right);
                    }
                }else{
                    TreeNode currentNode = queue.pollLast();
                    currentLevel.add(currentNode.val);
                    if (currentNode.right != null){
                        queue.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null){
                        queue.addFirst(currentNode.left);
                    }
                }
            }
            reverse = !reverse;
            result.add(currentLevel);
        }
        return result;
    }

//    https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lot = new ArrayList<>();

        if(root == null){
            return lot;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for(int i=0; i<levelSize; i++){
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            lot.add(0, currentLevel);
        }
        return lot;
    }

//    https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
    public Node connectLevelNode (Node root) {
        if (root == null) return null;

        Node leftMost = root;

        while (leftMost.left != null){
            Node current = leftMost;
            while (current != null){
                current.left.next = current.right;
                if (current.next != null){
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }

//    https://leetcode.com/problems/cousins-in-binary-tree/
    public boolean isCousins(TreeNode root, int x, int y){
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (level(root, xx, 0) == level(root, yy, 0) && (!isSibling(root, xx, yy)));
    }
    TreeNode findNode(TreeNode node, int x){
        if (node == null) return null;

        if (node.val == x) return node;

        TreeNode n = findNode(node.left, x);
        if (n != null) return n;

        return findNode(node.right, x);
    }
    boolean isSibling(TreeNode node, TreeNode x, TreeNode y){
        if (node == null) return false;

        return (
                (node.left == x && node.right == y) || (node.left == y && node.right == x) || isSibling(node.left, x, y) || isSibling(node.right, x, y)
                );
    }
    int level(TreeNode node, TreeNode x, int lev){
        if (node == null) return 0;

        if (node == x) return lev;

        int l = level(node.left, x, lev+1);
        if (l != 0) return l;

        return level(node.right, x, lev+1);
    }



}
