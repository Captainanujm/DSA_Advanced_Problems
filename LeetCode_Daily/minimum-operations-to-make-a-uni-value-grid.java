class Solution {
    public int minOperations(int[][] grid, int x) {
        //check for the number can be changeable or not..(divide and check reminder)
        //sort the elements and check for the  middle element
        //you get the number now iterate the array and check for opns and return it..
        int rem=grid[0][0]%x;
        if(grid.length==1&&grid[0].length==1){
            return 0;
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if((grid[i][j]%x)!=rem){
                    return -1;
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                list.add(grid[i][j]);
            }
        }
        Collections.sort(list);
        int ele=list.get((int)list.size()/2);
        int minopns=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(ele>grid[i][j]){
                    int num=grid[i][j];
                    while(num!=ele){
                        num=num+x;
                        minopns++;
                    }
                }else if(ele<grid[i][j]){
                    int num=grid[i][j];
                    while(num!=ele){
                        num=num-x;
                        minopns++;
                    }
                }else{

                }
            }
        }


        

return minopns;
    }
}
