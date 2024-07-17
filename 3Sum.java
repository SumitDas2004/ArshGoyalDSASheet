import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        for(int i=1;i+1<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(set.contains((nums[i]+nums[j])*-1))
                {
                    List<Integer> list = Arrays.asList((nums[i]+nums[j])*-1, nums[i], nums[j]);
                    Collections.sort(list);
                    ans.add(list);
                }
            }
            set.add(nums[i]);
        }
        return new ArrayList<>(ans);
    }
}