class Solution {
    public String longestPalindrome(String s) {
        String finalAns="";
        for(int i=0;i<s.length();i++){
            String ans1=expand(s,i,i);//for odd length
            String ans2=expand(s,i,i+1);//for even length
            if(finalAns.length()<ans1.length()){
                finalAns=ans1;
            }
             if(finalAns.length()<ans2.length()){
                finalAns=ans2;
            }
        }
        return finalAns;
    }
    public String expand(String s,int start,int end){
        while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        return s.substring(start+1,end);
    }
}
