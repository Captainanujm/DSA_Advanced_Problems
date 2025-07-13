class Solution {
    public void NSE_LEFT_Arr(int []temparr,int []arr){
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(i==arr.length-1){
                st.push(i);
            }else{
                while(!st.isEmpty()&&arr[i]<=arr[st.peek()]){
                    temparr[st.pop()]=i;
                }
                st.push(i);
            }
        }
    }
    public void NSE_RIGHT_Arr(int []temparr,int []arr){
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(i==0){
                st.push(i);
            }else{
                while(!st.isEmpty()&&arr[i]<arr[st.peek()]){
                    temparr[st.pop()]=i;
                }
                st.push(i);
            }
        }
    }
    public int sumSubarrayMins(int[] arr) {
        int []NSE_LEFT=new int[arr.length];
        int []NSE_RIGHT=new int[arr.length];
        Arrays.fill(NSE_LEFT,-1);
         Arrays.fill(NSE_RIGHT,arr.length);
        long number_sub=0;
        int mod=(int)Math.pow(10,9)+7;
        int left=0;
        int right=0;
        long totalsum=0;
        NSE_LEFT_Arr(NSE_LEFT,arr);
        NSE_RIGHT_Arr(NSE_RIGHT,arr);
            for(int i=0;i<arr.length;i++){
            left=i-NSE_LEFT[i]-1;
            right=NSE_RIGHT[i]-i-1;
            number_sub=(long)(left+1)*(right+1);
            number_sub=number_sub%mod;
            totalsum=(totalsum+((long)number_sub*arr[i])%mod)%mod;
        }
        return (int)totalsum;
    }
}
