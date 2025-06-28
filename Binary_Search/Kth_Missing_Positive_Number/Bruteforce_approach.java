class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int t=1;t<arr[0];t++){
            list.add(t);
            if(list.size()==k){
                return list.get(list.size()-1);
            }
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]>1){
                int temp=arr[i]+1;
                while(temp!=arr[i+1]){
                    list.add(temp);
                    if(list.size()==k){
                        return list.get(list.size()-1);
                    }
                    temp++;
                }
            }
        }
        int lastplusone=arr[arr.length-1]+1;
       while(list.size()<k){
        
        list.add(lastplusone);
        lastplusone++;
       }
       return list.get(list.size()-1);
    }
}
