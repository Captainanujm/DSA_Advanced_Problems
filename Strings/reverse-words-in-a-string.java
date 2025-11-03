class Solution {
    public String reverseWords(String s) {
        StringBuilder st=new StringBuilder();
        s=s.trim();
        int i=s.length()-1;
        int j=s.length();
        while(i>=0){
            while(i>=0&&s.charAt(i)!=' '){
                i--;
            }
            st.append(s.substring(i+1,j));
           
            while(i>0&&s.charAt(i)==' '){
                 i=i-1;
            }
            j=i+1;
            st.append(' ');
        }
       
       
        return st.toString().trim();
    }
}
