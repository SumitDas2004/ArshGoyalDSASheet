class Solution {
    public boolean isAllSame(int i, String[] strs){
        char c = strs[0].charAt(i);
        for(String s:strs)
            if(s.charAt(i)!=c)return false;
        return true;
    }
    public String longestCommonPrefix(String[] strs) {
        int n = Integer.MAX_VALUE;
        for(String s:strs)n = Math.min(n, s.length());
        int i = 0;
        while(i<n){
            if(!isAllSame(i, strs))break;
            i++;
        }
        return strs[0].substring(0, i);

    }
}