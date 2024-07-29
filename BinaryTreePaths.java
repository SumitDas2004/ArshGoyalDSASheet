class Solution {
    void helper(List<String> list, String s, TreeNode root){
        if(root==null)return ;
        s+=(s.length()>0?"->":"")+root.val;
        if(root.left==null && root.right==null){
            list.add(s);
            return ;
        }
        helper(list, s, root.left);
        helper(list, s, root.right);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans =new ArrayList<>();
        helper(ans, "", root);
        return ans;
    }
}
