package advanceTreeQuest;

import java.util.HashMap;

public class PreIn  {
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

    public TreeNode buildTree(int[] preOrder, int[] inOrder){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inOrder.length; i++) {
            map.put(inOrder[i], i);
        }
        int[] index = {0};

        return helper(preOrder, inOrder, 0, preOrder.length - 1, map, index);
    }

    public TreeNode helper(int[] preOrder, int[] inOrder, int left, int right, HashMap<Integer, Integer> map, int[] index){
        if (left > right) return null;

        int current = preOrder[index[0]];
        index[0]++;
        TreeNode node = new TreeNode(current);

        if (left == right) return node;

        int inOrderIndex = map.get(current);

        node.left = helper(preOrder, inOrder, left, inOrderIndex - 1, map, index);
        node.right = helper(preOrder, inOrder, inOrderIndex + 1, right, map, index);

        return node;
    }

    /* 1ms runtime
    private HashMap<Integer, Integer> inorderMap;
    private int preorderIndex;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderMap = new HashMap<>();
        preorderIndex = 0;

        // Mapa: wartość -> indeks w inorder, aby szybko znaleźć podział
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return buildSubTree(preorder, 0, inorder.length - 1);
    }

    private TreeNode buildSubTree(int[] preorder, int left, int right) {
        if (left > right) return null; // Poddrzewo nie istnieje

        int rootValue = preorder[preorderIndex++]; // Pobieramy aktualny korzeń
        TreeNode root = new TreeNode(rootValue);

        int inorderRootIndex = inorderMap.get(rootValue); // Znajdujemy korzeń w inorder

        // Rekurencyjne budowanie lewego i prawego poddrzewa
        root.left = buildSubTree(preorder, left, inorderRootIndex - 1);
        root.right = buildSubTree(preorder, inorderRootIndex + 1, right);

        return root;
    }
     */

    /* 0ms runtime using dfs
    int inOrInd = 0;
    int preOrInd = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return dfs(preorder, inorder, Integer.MAX_VALUE);
    }

    private TreeNode dfs(int[] preorder, int[] inorder, int limit){
        if(preOrInd >= preorder.length) return null;
        if(inorder[inOrInd] == limit){
            inOrInd++;
            return null;
        }

        TreeNode newNode = new TreeNode(preorder[preOrInd++]);
        newNode.left = dfs(preorder, inorder, newNode.val);
        newNode.right = dfs(preorder, inorder, limit);

        return newNode;
    }
     */
}
