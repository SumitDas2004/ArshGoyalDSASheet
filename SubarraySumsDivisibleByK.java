class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int map[]=new int[k];
        map[0]= 1;
        int sum = 0;
        int ans = 0;
        for(int i:nums){
            sum+=i+k;
            sum%=k;
            if(sum<0)sum+=k;
            ans+=map[sum];
            map[sum]++;
        }
        return ans;
    }
}