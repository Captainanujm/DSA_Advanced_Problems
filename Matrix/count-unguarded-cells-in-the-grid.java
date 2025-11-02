class Solution {
    public void markGuarded(int row,int col,int [][]grid){
        //for left;
        for(int k=col-1;k>=0;k--){
            if(grid[row][k]==2||grid[row][k]==3){
                break;
            }
            grid[row][k]=1;
        }
        //for right
        for(int k=col+1;k<grid[row].length;k++){
            if(grid[row][k]==2||grid[row][k]==3){
                break;
            }
            grid[row][k]=1;
        }
        //for up
         for(int k=row-1;k>=0;k--){
            if(grid[k][col]==2||grid[k][col]==3){
                break;
            }
            grid[k][col]=1;
        }
        //for down
         for(int k=row+1;k<grid.length;k++){
            if(grid[k][col]==2||grid[k][col]==3){
                break;
            }
            grid[k][col]=1;
        }
    }
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
         int [][]grid=new int[m][n];
        //for guards
        for(int i=0;i<guards.length;i++)
        {
            int pos1=guards[i][0];
            int pos2=guards[i][1];
            grid[pos1][pos2]=2;
        }
        //for walls
        for(int j=0;j<walls.length;j++){
            int pos1=walls[j][0];
            int pos2=walls[j][1];
            grid[pos1][pos2]=3;
        }
        //mark guarded
        for(int i=0;i<guards.length;i++){
            int pos1=guards[i][0];
            int pos2=guards[i][1];
            markGuarded(pos1,pos2,grid);
        }
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==0){
                    count++;
                }
            }
        }
        return count;
    }
}
