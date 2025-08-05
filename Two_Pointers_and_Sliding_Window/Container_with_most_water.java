class Solution {
    public int maxArea(int[] height) {
        // Just use two pointer and decrease left is left is smaller else decrease right.
        // if equals then try to obtain max between two.
        int left=0;
        int maxAr=Integer.MIN_VALUE;
        int right=height.length-1;
        while(left<right){
            int min=Math.min(height[left],height[right]);
            maxAr=Math.max(maxAr,min*(right-left));
            //just decrement the right if height[left] is greater
            if(height[left]>height[right]){
                right--;
            }
            else if(height[left]<height[right]){
                left++;
            }else{
                if(height[left+1]>height[right-1]&&(left<height.length-1&&right>0)){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return maxAr;
    }
}
