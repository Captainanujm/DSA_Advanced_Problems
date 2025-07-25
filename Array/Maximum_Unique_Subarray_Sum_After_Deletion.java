class Solution {
    public int maxSum(int[] nums) {
        // if array contains only one element and which is -ve return it only--
        //because there is no other max element than this.
        if(nums.length==1){
            return nums[0];
        }
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
       for(int num:nums){
        // Only take positive element in map--
        // because negative element decreases the sum of subarray.
        if(num>0){
            map.put(num,map.getOrDefault(num,0)+1);
         }
        }
        // Here is the catch, if array contain all negative elements--
        // then return maximum negative number present in the array.
        if(map.size()==0){
            for(int num:nums){
                max=Math.max(max,num);
            }
            return max;
        }
         ArrayList<Integer>list=new ArrayList<>(map.keySet());
         for(int num:list){
            sum=sum+num;
         }
        return sum;
    }
}
