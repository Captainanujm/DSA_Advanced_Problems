// User function Template for Java

class Solution {
    static int checkCompressed(String S, String T) {
        // code here
        int i=0;
        int j=0;
        while(j<T.length()){
            if(!Character.isDigit(T.charAt(j))){
                if(S.charAt(i)!=T.charAt(j)){
                    return 0;
                }else{
                    i++;
                    j++;
                    if(i>=S.length()&&j<T.length()){
                        return 0;
                    }
                }
            }
            else{
                String temp="";
                while(j<T.length()&&Character.isDigit(T.charAt(j))){
                    temp=temp+T.charAt(j);
                    j++;
                }
                int jump=Integer.parseInt(temp);
                i=i+jump;
                if(i==S.length()&&j==T.length()){
                    return 1;
                }
                if(i>=S.length()&&j<T.length()){
                    return 0;
                }
            }
        }
      if(i==S.length()){
          return 1;
      }return 0;
    }
}
