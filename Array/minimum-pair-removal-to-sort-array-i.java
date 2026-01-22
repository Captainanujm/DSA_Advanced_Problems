class Solution {
    public int minimumPairRemoval(int[] nums) {
        boolean isSorted=false;
        int opn=0;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        while(isSorted==false){
            int i=0;
            int j=1;
            int finalone=0;
            int finaltwo=0;
            isSorted=true;
            int sum=0;
            int minsum=Integer.MAX_VALUE;
            while(j<list.size()){
                 sum=list.get(i)+list.get(j);
                  if(sum<minsum){
                        minsum=sum;
                        finalone=i;
                        finaltwo=j;
                    }
                if(list.get(i)>list.get(j)){
                    isSorted=false;
                   
                }
                i++;
                j++;
            }
            if(isSorted==false){
                list.set(finalone,minsum);
                list.remove(finaltwo);
                opn++;
            }

        }
        return opn;
    }
}
