class Solution {
    public void helper(int a, int b, int val, List<String> ans, StringBuilder s) {
        if(a==0 && b==0){
            if(val==0)
            ans.add(s.toString());
            return ;
        }
        if(val<0)return ;

        if(a>0){
            s.append("(");
            helper(a-1, b, val+1, ans, s);
            s.deleteCharAt(s.length()-1);
        }

        if(b>0){
            s.append(")");
            helper(a, b-1, val-1, ans, s);
            s.deleteCharAt(s.length()-1);
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n, n, 0, ans, new StringBuilder());
        return ans;
    }
}