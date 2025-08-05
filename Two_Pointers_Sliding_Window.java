class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer>map=new HashMap<>();
        //Adding the last index of every element
        for(int i=s.length()-1;i>=0;i--){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
            }
        }
        //variable to trace the highest index of window
        int highestValue=-1;
        int last=-1;
        ArrayList<Integer>list=new ArrayList<>();
        //logic to get the highest peak index till now after which no element should come which 
        // are in current window.
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))>highestValue){
                highestValue=map.get(s.charAt(i));
            }
            if(highestValue==i){
                if(last==-1){
                    //ensuring first set of string
                    list.add(i-0+1);
                    last=i;
                }else{
                    list.add(i-last);
                    last=i;
                }
            }
        }
        return list;
    }
}
