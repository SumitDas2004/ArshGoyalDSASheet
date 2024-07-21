import java.util.ArrayDeque;
class Solution {
    public String simplifyPath(String path) {
        String arr[] = path.split("/");
        ArrayDeque<String> st = new ArrayDeque<>();
        for(String s:arr){
            if(s.length()==0)continue;
            if(s.equals("."))continue;
            if(s.equals("..")){
             if(!st.isEmpty())st.pop();
            }else
             st.push(s);
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty())ans.insert(0, "/"+st.pop());
        if(ans.length()==0)ans.append("/");
        return ans.toString();
    }
}