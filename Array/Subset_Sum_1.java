class Solution {
  ArrayList<Integer>list=new ArrayList<>();
  public void helper(int []nums,int i,int sum){
    if(i>nums.length-1){
      list.add(sum);
      return;
    }
    helper(nums,i+1,sum+nums[i]);
    helper(nums,i+1,sum);
  }
    public List<Integer> subsetSums(int[] nums) {
        //your code goes here
      helper(nums,0,0);
      Collections.sort(list);
      return list;

    }
}
