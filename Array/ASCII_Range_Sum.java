class Solution {
    public ArrayList<Integer> asciirange(String s) {
        // code here
//Two array for first and last occurence.
       int []firstocc=new int[26];
       int []lastocc=new int[26];
       ArrayList<Integer>ans=new ArrayList<>();
       for(int i=0;i<26;i++){
           firstocc[i]=-1;
           lastocc[i]=-1;
       }
       for(int i=0;i<s.length();i++){
           if(firstocc[s.charAt(i)-97]==-1){
               firstocc[s.charAt(i)-97]=i;
           }
          //if lastocc is max then update it.
           lastocc[s.charAt(i)-97]=Math.max(lastocc[s.charAt(i)-97],i);
       }
       for(int i=0;i<26;i++){
        //if lastocc and firstocc are not same then calculate the sum between it.
                                        //only i checked firstocc because if firstocc are not changed,
                                        // then lastocc will be sure be unchanged.
           if(lastocc[i]-firstocc[i]>0&&firstocc[i]!=-1){
               int sum=0;
               for(int j=firstocc[i]+1;j<lastocc[i];j++){
                   sum=sum+(int)s.charAt(j);
               }
               if(sum!=0){
                   ans.add(sum);
               }
               
           }
       }
        return ans;
    }
}
