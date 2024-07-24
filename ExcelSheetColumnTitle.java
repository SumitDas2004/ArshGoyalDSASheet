class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        columnNumber--;

        while(columnNumber>=0){
            int val = columnNumber%26;
            ans.append((char)(65+val));
            columnNumber/=26;
            columnNumber-=1;
        }
        return ans.reverse().toString();
    }
}
