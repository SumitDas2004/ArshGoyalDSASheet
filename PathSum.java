class Solution {
    public boolean helper(TreeNode root, int targetSum) {
        if(root==null)return false;
        if(root.left==null && root.right==null)return targetSum==root.val;
        return helper(root.left, targetSum-root.val) || helper(root.right, targetSum-root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        return helper(root, targetSum);
    }
}
