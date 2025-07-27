class Solution {
    public int countHillValley(int[] nums) {
        int []left=new int[nums.length];
        int []right=new int[nums.length];
        left[0]=-1;
        right[right.length-1]=-1;
        Stack<Integer>st=new Stack<>();
       st.push(nums[0]);
       //previous unequal
        for(int i=1;i<nums.length;i++){
            while(!st.isEmpty()&&nums[i]==st.peek()){
                
                    st.pop();
            }
            if(!st.isEmpty()){
                 left[i]=st.peek();
            }else{
                left[i]=-1;
            }
           
            st.push(nums[i]);
        }
        st.clear();
        st.push(nums[nums.length-1]);
         for(int i=nums.length-2;i>=0;i--){
             while(!st.isEmpty()&&nums[i]==st.peek()){
                
                    st.pop();
            }
            if(!st.isEmpty()){
                 right[i]=st.peek();
            }else{
                right[i]=-1;
            }
            st.push(nums[i]);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(left[i]==-1||right[i]==-1){
                continue;
            }
            //for duplicate counting of valleys
              if(i > 0 && nums[i] == nums[i-1]) {
                continue;
             }
            //for hill
            if(left[i]<nums[i]&&right[i]<nums[i]){
                count++;
            }
            //for valley
            if(left[i]>nums[i]&&right[i]>nums[i]){
                count++;
            }
        }

    return count;
    }
}
