class Solution {
    void helper(List<Integer> list, TreeNode root){
        if(root==null)return ;
        helper(list, root.left);
        list.add(root.val);
        helper(list, root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(list, root);
        int ans = Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            ans = Math.min(ans, list.get(i)-list.get(i-1));
        }
        return ans;
    }
}
