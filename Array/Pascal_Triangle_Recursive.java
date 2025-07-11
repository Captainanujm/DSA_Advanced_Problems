class Solution {
     List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> helper(int n){
         if(n==1){
            list.get(0).add(1);
           
        }
        else{
            helper(n-1);
            list.get(n-1).add(1);
            for (int i = 0; i < list.get(n - 2).size() - 1; i++) {
                list.get(n-1).add(list.get(n - 2).get(i) + list.get(n - 2).get(i + 1));
            }
            list.get(n-1).add(1);
            
        }
        return list;
    }
    public List<List<Integer>> generate(int numRows) {
        for(int i=0;i<numRows;i++){
            list.add(new ArrayList<>());
        }
     return  helper(numRows);
       
    }
}
