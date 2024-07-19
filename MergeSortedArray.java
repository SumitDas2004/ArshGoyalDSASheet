class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        n+=m;
        int i= 0;
        int j= 0;
        while(i<nums1.length && j<nums2.length){
            int shifts = 0;
            for(int k=j;k<nums2.length && nums1[i]>=nums2[k];k++){
                shifts++;
            }
            if(shifts==0){
                i++;
                continue;
            }
            for(int k=m-1;k>=i;k--)nums1[shifts+k] = nums1[k];
            m+=shifts;
            for(int k=0;k<shifts;k++){
                nums1[i++] = nums2[j++];
            }
        }

        while(m<nums1.length)nums1[m++] = nums2[j++];
        
    }
}