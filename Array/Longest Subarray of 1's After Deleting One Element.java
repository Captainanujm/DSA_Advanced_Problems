// Intuition-: Just traverse the subarray and allow it until one zero comes in, if subarray exceeds one zero then reduce the left pointer till the count 
// becomes <2 , and its said that return the length with atleast one element being deleted so return maxlength-1 because if the array contains all ones then,
// too we have to delete one element, and if array contains one zero then too we have to delete that one zero, so the subarray length becomes maxlength-1

class Solution {
    public int longestSubarray(int[] nums) {
        int count=0;
        int left=0;
        int maxlength=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                count++;
            }
            if(count<2){
                maxlength=Math.max(maxlength,right-left+1);
            }
            if(count>=2){
                while(nums[left]!=0){
                    left++;
                }
                left++;
                count--;
            }
        }
        if(maxlength==0){
            return 0;
        }
        return maxlength-1;
    }
}
