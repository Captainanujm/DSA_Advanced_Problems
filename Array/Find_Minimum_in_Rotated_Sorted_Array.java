class Solution {
    public int findMin(int[] nums) {
        int mid=0,low=0,high=nums.length-1;
        int shortest=Integer.MAX_VALUE;
        while(low<=high){
            mid=(low+high)/2;
            shortest=Math.min(nums[mid],shortest);
            if(nums[mid]>=nums[low]&&nums[high]<nums[mid]){
                low=mid+1;
            }
            else if(nums[mid]<=nums[low]){
                
                    high=mid-1;
                
            }
            else{
                if(nums[low]<shortest){
                    return nums[low];
                }else{
                    return shortest;
                }
                
            }
        }
       return shortest; 
    }
}
