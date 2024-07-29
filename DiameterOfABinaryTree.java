class Solution {
    int ans =0;
    int helper(TreeNode root){
        if(root==null)return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        ans = Math.max(left+right, ans);
        return Math.max(left, right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0;
        helper(root);
        return ans;
    }
}
