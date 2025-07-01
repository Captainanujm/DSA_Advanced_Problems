class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
          
            if(map.containsKey(sum)==true||sum==0){
                return true;
            }else{
                map.put(sum,i);
            }
            
        }
        return false;
        
    }
}
