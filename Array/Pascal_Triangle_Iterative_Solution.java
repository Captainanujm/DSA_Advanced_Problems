class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer>templist=new ArrayList<>();
            list.add(templist);
        }
        for(int i=0;i<list.size();i++){
            if(i==0){
                list.get(i).add(1);
            }
            else if(i==1){
                list.get(i).add(1);
                list.get(i).add(1);
            }
            else{
                list.get(i).add(1);
                int j=0;
                while(j+1<list.get(i-1).size()){
                    list.get(i).add(list.get(i-1).get(j)+list.get(i-1).get(j+1));
                    j++;
                }
                list.get(i).add(1);
            }
        }
        return list;
    }
}
