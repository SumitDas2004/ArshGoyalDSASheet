class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long product=1;
        for(int i:nums)product*=i;
        long p[]=new long[n];
        if(product==0){
            product=1;
            int cnt=0;
            for(int i:nums){
                if(i!=0)product*=i;
                else cnt++;
            }
            if(cnt>1)return p;
            for(int i=0;i<n;i++)if(nums[i]==0)p[i]=product;
            return p;
        }
        for(int i=0;i<n;i++)p[i]=product/nums[i];
        return p;
	} 
} 
