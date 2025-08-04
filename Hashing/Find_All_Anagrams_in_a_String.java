//Logic-: Just make 2 maps and constantly check the equality of both maps using sliding window to remove and add elements

//Follow up-: Please dont try to make check anagrams function for two strings and check for every substring with length "p", Please dont do this
// as it goes time limited exceeded.
// Use map.equals function because it checks the equality in O(N) for O(26) its O(1) time.

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         List<Integer>ans=new ArrayList<>();
        if(p.length()>s.length()){
            return ans;
        }
       
        HashMap<Character,Integer>mapforp=new HashMap<>();
         HashMap<Character,Integer>mapforwndw=new HashMap<>();
        for(int i=0;i<p.length();i++){
            mapforwndw.put(s.charAt(i),mapforwndw.getOrDefault(s.charAt(i),0)+1);
        }
         for(int i=0;i<p.length();i++){
            mapforp.put(p.charAt(i),mapforp.getOrDefault(p.charAt(i),0)+1);
        }
        if(mapforp.equals(mapforwndw)){
            ans.add(0);
        }
        int left=0;
        for(int right=left+p.length();right<s.length();right++){
            mapforwndw.put(s.charAt(right),mapforwndw.getOrDefault(s.charAt(right),0)+1);
             mapforwndw.put(s.charAt(left),mapforwndw.get(s.charAt(left))-1);
            if(mapforwndw.get(s.charAt(left))==0){
                mapforwndw.remove(s.charAt(left));
            }
             left++;
            if(mapforp.equals(mapforwndw)){
                ans.add(left);
            }
           
            
        }
    return ans;
    }
}
