class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)!=needle.charAt(0))
                continue;
            int a=i;
            int b=0;
            if(i+needle.length()>haystack.length())
                return -1;
            while(b<needle.length() && haystack.charAt(a)==needle.charAt(b)){
                a++;
                b++;
            }
            if(b==needle.length())return i;
            
        }
        return -1;
    }
}