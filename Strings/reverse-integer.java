class Solution {
    public int reverse(int x) {
        StringBuilder st=new StringBuilder();
        boolean neg=false;
       if(x<0){
        neg=true;
        x=x*-1;
       }

       while(x>0){
            st.append(x%10);
            x=x/10;
       }
       try{
        int answer=Integer.parseInt(st.toString());
        if(neg==true){
            return -1*answer;
        }
        return answer;
    //catch block to check exception whether lies in integer range or not.
       }catch(NumberFormatException e){
        return 0;
       }
       

    }
}
