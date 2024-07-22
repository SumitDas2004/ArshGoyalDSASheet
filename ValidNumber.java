class Solution {
    public boolean isAllDigits(String s){
        for(char c:s.toCharArray())if(!Character.isDigit(c))return false;
        return true;
    }
    public boolean isInteger (String s){
        if(s.length()==0)return false;
        if(s.charAt(0)=='+' || s.charAt(0)=='-')s = s.substring(1);
        if(s.length()==0)return false;
        return isAllDigits(s);
    }

    public boolean isDecimal(String s){
        if(s.length()==0)return false;
        if(s.charAt(0)=='+' || s.charAt(0)=='-')s = s.substring(1);
        if(s.equals("."))return false;
        if(!s.contains("."))return false;
        int ind = s.indexOf(".");
        if(ind==s.length()-1)return isAllDigits(s.substring(0, ind));
        return isAllDigits(s.substring(0, ind)) && isAllDigits(s.substring(ind+1));
    }
    public boolean isNumber(String s) {
        s = s.toLowerCase();
        if(s.contains("e")){
            int ind = s.indexOf("e");
            if(ind==s.length()-1)return false;
            boolean ans = isDecimal(s.substring(0, ind)) || isInteger(s.substring(0, ind));
            ans = ans&isInteger(s.substring(ind+1));
            return ans;
        } return isDecimal(s) || isInteger(s);
    }
}