class Solution {
    public boolean isEditable(String query, String dict){
        int changeCount=0;
          if(query.length()!=dict.length()){
                return false;
            }
        for(int i=0;i<query.length();i++){
          
             if(query.charAt(i)!=dict.charAt(i)){
                changeCount++;
            }
        }
        return changeCount<=2;

    }
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String>answer=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            int j=0;
            while(j<dictionary.length){
                boolean ans=isEditable(queries[i],dictionary[j]);
              if(ans){
                answer.add(queries[i]);
                break;
             }
                j++;
            }
            
        }
        return answer;
    }
}
