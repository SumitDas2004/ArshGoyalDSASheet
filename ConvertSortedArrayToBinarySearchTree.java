class Solution {
    TreeNode helper(int nums[], int l, int r){
        if(l>r)return null;
        if(l==r)return new TreeNode(nums[l]);
        int mid = l+(r-l)/2;
        TreeNode ans = new TreeNode(nums[mid]);
        ans.left = helper(nums, l, mid-1);
        ans.right = helper(nums, mid+1, r);
        return ans;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
}
