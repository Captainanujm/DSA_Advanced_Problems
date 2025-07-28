class Solution {
    public int countMaxOrSubsets(int[] nums) {
        ArrayList<String>list=new ArrayList<>();
        ArrayList<ArrayList<Integer>>twod=new ArrayList<>();
        int subsets=(int)Math.pow(2,nums.length);
        //generate all subsets in string arraylist
        for(int i=0;i<subsets;i++){
            String st="";
            int numb=i;
            //binary finding logic
        while(numb>0){
            st=st+(numb%2);
            numb=numb/2;
        }
            list.add(st);
        }
        //iterate through string arraylist and add the subsets in two d arraylist;
        for(int i=0;i<list.size();i++){
            ArrayList<Integer>andarlist=new ArrayList<>();
            String temp=list.get(i);
            for(int j=0;j<temp.length();j++){
                if(temp.charAt(j)=='1'){
                    andarlist.add(nums[j]);
                }
            }
            twod.add(andarlist);
        }
        //finding MAX-OR using OR of all elements in array;
        int max_OR=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            max_OR=max_OR|nums[i];
        }
        for(int i=0;i<twod.size();i++){
            int temp_OR=0;
            ArrayList<Integer>innerlist=twod.get(i);
             for(int j=0;j<innerlist.size();j++){
            temp_OR=temp_OR|innerlist.get(j);
        }
        //if subset_OR equals to max_OR count++;
        if(temp_OR==max_OR){
            count++;
        }
        }
        return count;
    }
}
