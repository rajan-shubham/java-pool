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
}
