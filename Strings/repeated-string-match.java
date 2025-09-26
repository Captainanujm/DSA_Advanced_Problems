class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int count=1;
        sb.append(a);
        while(b.length()>sb.length()){
            sb.append(a);
            count++;
        }
        //this logic is used to check if substring is present or not.
        if(sb.indexOf(b)!=-1){
            return count;
        }
      //one more repetetion sometimes.
       sb.append(a);
       count++;
        if(sb.indexOf(b)!=-1){
            return count;
        }
        return -1;
    }
}
