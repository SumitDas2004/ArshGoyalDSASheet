class Solution {
    int bs(int l, int r, int nums[], long tar){
        int start = l;
        int ans = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(tar>(long)nums[mid]*2){
                ans = mid;
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        if(ans==-1)return 0;
        else return ans-start+1;
    }
    int conqueor(int l, int r, int nums[]){
        int mid = l+(r-l)/2;
        int ans = 0;
        for(int i=l;i<=mid;i++){
            ans+=bs(mid+1, r, nums, nums[i]);
        }

        int i=l;
        int j = mid+1;
        int tmp[] = new int[r-l+1];
        int k = 0;
        while(i<=mid && j<=r){
            if(nums[i]<nums[j])tmp[k++] = nums[i++];
            else tmp[k++] = nums[j++];
        }
        while(i<=mid){
            tmp[k++] = nums[i++];
        } 
        while(j<=r){
            tmp[k++] = nums[j++];
        }
        for(int a=l, b=0;a<=r;a++, b++){
            nums[a] = tmp[b];
        }
        return ans;
    }
    public int divide(int l, int r, int nums[]){
        if(l>=r)return 0;
        int mid = l+(r-l)/2;
        int ans = divide(l, mid, nums);
        ans+=divide(mid+1, r, nums);
        ans+=conqueor(l, r, nums);
        return ans;

    }
    public int reversePairs(int[] nums) {
        return divide(0, nums.length-1, nums);
    }
}