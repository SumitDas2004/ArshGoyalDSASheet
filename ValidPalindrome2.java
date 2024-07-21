class Solution {
    boolean isPalindrome(String s){
        int l = 0;
        int r = s.length()-1;
        while(l<=r){
            if(s.charAt(l++)!=s.charAt(r--))return false;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r))return isPalindrome(s.substring(l, r)) || isPalindrome(s.substring(l+1, r+1));
            l++;
            r--;
        }
        return true;
    }
}