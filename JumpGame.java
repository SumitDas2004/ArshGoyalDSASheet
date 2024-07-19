class Solution {
    public boolean canJump(int[] nums) {
        int nearestFine = nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]+i>=nearestFine)nearestFine = i;
        }
        return nearestFine==0;
    }
}