//Core idea-:Sort the string to check for anagrams.

//Intuition-:
//Just sort the string and put it in the map just to check if it previously come or not
// if its come then add the original string(unsorted) in the map as value of sorted string.
// if it doesnt come then add the sorted string and the unsorted as the value of sorted string

//Why this works-:
//Because when we have to check for anagrams we have sort it and if sorted is already --
//present in the map then it has previously some string as anagram.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String temp=strs[i];
      //just convert the string to char Array for sorting and matching to the map whether its already come previously or not.
            char []ch=temp.toCharArray();
            Arrays.sort(ch);
            String tempo=new String(ch);
//checking if string has not come then put it in map in sorted version and in values we put original string
            if(!map.containsKey(tempo)){
                map.put(tempo,new ArrayList<>());
            }
        //adding the original string to map as the value of sorted string.
            map.get(tempo).add(temp);
        }

       List<List<String>> ans = new ArrayList<>(map.values());
       return ans;
    }
}
