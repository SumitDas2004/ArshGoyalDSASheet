import java.util.ArrayDeque;


class Solution {
    public String removeSpace(String s){
        StringBuilder  sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c!=' ')sb.append(c);
        }
        return sb.toString();
    }
    public int getInteger(String s, int i){
        StringBuilder sb = new StringBuilder();
        while(i<s.length() && Character.isDigit(s.charAt(i)))sb.append(s.charAt(i++));
        return Integer.parseInt(sb.toString());
    }
    public int calculate(String s) {
        s = removeSpace(s);
        ArrayDeque<Integer> st = new ArrayDeque<>();
        st.push(getInteger(s, 0));
        int i=0;
        while(i<s.length() && Character.isDigit(s.charAt(i)))i++;
        while(i<s.length()){
            if(s.charAt(i)=='+'){
                st.push(getInteger(s, ++i));
                while(i<s.length() && Character.isDigit(s.charAt(i)))i++;
            }else if(s.charAt(i)=='-'){
                st.push(getInteger(s, ++i)*-1);
                while(i<s.length() && Character.isDigit(s.charAt(i)))i++;
            }else if(s.charAt(i)=='*'){
                st.push(st.pop()*getInteger(s, ++i));
                while(i<s.length() && Character.isDigit(s.charAt(i)))i++;
            }else if(s.charAt(i)=='/'){
                st.push(st.pop()/getInteger(s, ++i));
                while(i<s.length() && Character.isDigit(s.charAt(i)))i++;
            }
        }
        int ans = 0;
        for(int e:st)ans+=e;
        return ans;
    }
}