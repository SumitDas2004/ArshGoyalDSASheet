class Solution {
    public int majorityElement(int[] nums) {
        int cnt= 0;
        int elm = 0;
        for(int i:nums){
            if(cnt==0){
                elm = i;
                cnt = 1;
            }else{
                if(elm==i)cnt++;
                else cnt--;
            }
        }
        cnt = 0;
        for(int i:nums)if(i==elm)cnt++;
        if(cnt<=nums.length/2)return 0;
        return elm;
        
    }
}