class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int maxdist=0;
        int j=0;
        for(int i=0;i<nums1.length;i++){
            while(j<nums2.length&&nums2[j]>=nums1[i]){
                maxdist=Math.max(maxdist,j-i);
                j++;
            }
        }
        return maxdist;
    }
}
