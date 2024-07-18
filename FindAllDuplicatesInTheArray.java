import java.util.List;;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i:nums)
        {
            if(nums[i%(int)1e9-1]<(int)1e9*2)
            nums[i%(int)1e9-1]+=(int)1e9;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=(int)1e9*2)ans.add(i+1);
        }
        return ans;
    }
}