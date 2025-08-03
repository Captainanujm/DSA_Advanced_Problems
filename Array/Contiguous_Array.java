//Used prefix sum and hashmap to store the index and sum in hashmap.
//First put (0,-1) to handle edge case [0,1].

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum=sum-1;
            }
            if(nums[i]==1){
                sum=sum+1;
            }
           if(map.containsKey(sum)){
                maxlen=Math.max(maxlen,i-map.get(sum));
           }
           else{
            map.put(sum,i);
           }
         

        }
        return maxlen;
    }
}
