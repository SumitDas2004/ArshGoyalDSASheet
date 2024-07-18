class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left[] = new int[cardPoints.length];
        int right[]= new int[cardPoints.length];
        left[0] = cardPoints[0];
        int ans =0;
        right[cardPoints.length-1] = cardPoints[cardPoints.length-1];
        for(int i=1;i<cardPoints.length;i++){
            left[i]+=cardPoints[i]+left[i-1];
        }
        for(int i=cardPoints.length-2;i>=0;i--){
            right[i]+=right[i+1]+cardPoints[i];
        }
        ans = left[k-1];
        for(int l=k-2, r=cardPoints.length-1;l>=0;l--, r--){
            ans = Math.max(ans, left[l]+right[r]);
        }
        ans = Math.max(ans, right[cardPoints.length-k]);
        return ans;
    }
}