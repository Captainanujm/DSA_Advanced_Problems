class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int []ans=new int[nums.length];
        int []setbit=new int[32];
        for(int k=0;k<32;k++){
            setbit[k]=-1;
        }
        for(int i=nums.length-1;i>=0;i--){
            int num=nums[i];
            int endindex=Integer.MIN_VALUE;
            for(int j=0;j<32;j++){
                if(((num>>j)&1)!=0){
                    setbit[j]=i;
                }else{
                  if (setbit[j] != -1) {
                        endindex = Math.max(endindex, setbit[j]);
                    }

                }
            }
            if(endindex==Integer.MIN_VALUE){
                ans[i]=1;
            }else{
                ans[i]=endindex-i+1;
            }
        }
        return ans;
    }
}
