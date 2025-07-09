class Solution {
    static boolean helper(int i,int arr[],int sum,int target){
        if(sum==target){
            return true;
        }
        if(i>arr.length-1){
            return false;
        }
        return helper(i+1,arr,sum+arr[i],target)||helper(i+1,arr,sum,target);
    }
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        boolean ans=helper(0,arr,0,sum);
        return ans;
    }
}
