package questions;

public class PathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // https://leetcode.com/problems/path-sum/description/
    int sum = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        sum += root.val;
        if(sum == targetSum && root.left == null && root.right == null) return true;

        boolean bleft = hasPathSum(root.left, targetSum);
        boolean bright = hasPathSum(root.right, targetSum);
        if(bleft == false && bright == false){
            sum -= root.val;
        }
        return bleft || bright;
    }

    /*
    public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null) {
      return false;
    }
    if (root.val == sum && root.left == null && root.right == null) {
      return true;
    }
    return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
     */

//    https://leetcode.com/problems/sum-root-to-leaf-numbers/description/
    public int sumNumbers(TreeNode root){
        return dfs(root, 0);
    }
    public int dfs(TreeNode node, int sum){
        if (node == null) return 0;
        sum = sum * 10 + node.val;
        if (node.left == null && node.right == null) return sum;
        return dfs(node.left, sum) + dfs(node.right, sum);
    }

//    https://leetcode.com/problems/binary-tree-maximum-path-sum/
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        helper(root);
        return ans;
    }
    public int helper(TreeNode node){
        if (node == null) return 0;

        int left = helper(node.left);
        int right = helper(node.right);

        left = Math.max(0, left);
        right = Math.max(0, right);

        int pathSum = left + right + node.val;

        ans = Math.max(ans, pathSum);

        return Math.max(left, right) + node.val;
    }

    public boolean findPath(TreeNode node, int[] arr){
        if (node == null) return arr.length == 0;
        return findPathHelper(node, arr, 0);
    }
    private boolean findPathHelper(TreeNode node, int[] arr, int index){
        if (node == null) return false;

        if (index >= arr.length || node.val != arr[index]) return false;

        if (node.left == null && node.right == null && index == arr.length -1) return true;

        return findPathHelper(node.left, arr, index+1) || findPathHelper(node.right, arr, index+1);
    }

}
