// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] asteroids) {
        // code here
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(st.isEmpty()){
                st.push(asteroids[i]);
            }else{
                if(asteroids[i]<0){
                    while(!st.isEmpty()&&st.peek()>0&&Math.abs(asteroids[i])>st.peek()){
                        st.pop();
                    }
                    if(!st.isEmpty()&&Math.abs(asteroids[i])==st.peek()){
                        st.pop();
                        continue;
                    }
                    if(!st.isEmpty()&&st.peek()>Math.abs(asteroids[i])){
                        continue;
                    }
                    st.push(asteroids[i]);
                    
                }else{
                    st.push(asteroids[i]);
                }
            }
        }
        int []ans=new int[st.size()];
         int []ansf=new int[st.size()];
        int i=0;
        while(!st.isEmpty()){
            ans[i]=st.pop();
            i++;
        }
         i=0;
        for(int j=ans.length-1;j>=0;j--){
            ansf[i]=ans[j];
            i++;
        }
        return ansf;
    }
}
