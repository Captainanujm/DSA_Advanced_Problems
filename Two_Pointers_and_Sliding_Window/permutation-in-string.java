class Solution {
    public boolean checkInclusion(String s1, String s2) {
         HashMap<Character,Integer>ormap=new HashMap<>();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
            ormap.put(s1.charAt(i),ormap.getOrDefault(s1.charAt(i),0)+1);

        }
        int left=0;
        int right=0;
      while(right<s2.length()){
            if(map.containsKey(s2.charAt(right))){
                map.put(s2.charAt(right),map.get(s2.charAt(right))-1);
                if(map.get(s2.charAt(right))==0){
                    map.remove(s2.charAt(right));
                }
                if(map.isEmpty()){
                    return true;
                }
                right++;
               
            }
            else{
                left=left+1;
                right=left;
                 if(!map.isEmpty()){
                  map.putAll(ormap);
               }else{
                return true;
               }
             
            }
        }
        return map.isEmpty();
    }
}
