import java.util.*;
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int l = 0;
        int r = m-1;
        int ans = Integer.MAX_VALUE;
        while(r<n){
            ans = Math.min(ans, a.get(r)-a.get(l));
            r++;
            l++;
        }
        return ans;
    }
}