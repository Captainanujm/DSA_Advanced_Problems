//Intuition-: Just use map to store key and values and map with separate index and regular check if this key or value is used then 
// does not put it else put it in map
// JUST ENSURE EVERY KEY AND VALUE USED ONCE IN MAP.
//2) if length of words string and pattern does not match return false because it is not possible to create match if length does not same.

class Solution {
    public boolean wordPattern(String pattern, String s) {
        int spacecomes=-1;
        ArrayList<String>list=new ArrayList<>();
        Map<Character,String>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            //just adding the strings separated by space in hashset.
           if(s.charAt(i)==' '){
                list.add(s.substring(spacecomes+1,i));
                spacecomes=i;
               
           }
        //just to add the last string because the last string does not have trailing space.
           if(i==s.length()-1){
            list.add(s.substring(spacecomes+1,i+1));
            
           }
        }
        if(list.size()!=pattern.length()){
            return false;
        }
        for(int j=0;j<pattern.length();j++){
            if(map.containsKey(pattern.charAt(j))){
                if(!map.get(pattern.charAt(j)).equals(list.get(j))){
                    return false;
                }
            }else{
                //to check bijection
                if(!map.containsValue(list.get(j))){
                     map.put(pattern.charAt(j),list.get(j));
                }else{
                    return false;
                }
            }
        }

     return true;
    }
}
