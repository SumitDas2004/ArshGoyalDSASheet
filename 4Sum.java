class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>>  list = new ArrayList<>();
        for(int i=0;i+3<nums.length;i++){
            for(int j=i+1;j+2<nums.length;j++){
                int l = j+1;
                int r = nums.length-1;
                while(l<r){
                    if((long)nums[i]+nums[j]+nums[l]+nums[r]<target)l++;
                    else if((long)nums[i]+nums[j]+nums[l]+nums[r]==target){
                        list.add(Stream.of(nums[i], nums[j], nums[l], nums[r]).collect(Collectors.toList()));
                        int tmp1 = l;
                        int tmp2 = r;
                        while(l<r && nums[tmp1]==nums[l])l++;
                        while(l<r && nums[tmp2]==nums[r])r--;
                    }
                    else r--;
                }
                while(j+1<nums.length && nums[j]==nums[j+1]){
                    j++;
                }
            }
            while(i+1<nums.length && nums[i]==nums[i+1]){
                i++;
            }
        }
        return list;
    }
}