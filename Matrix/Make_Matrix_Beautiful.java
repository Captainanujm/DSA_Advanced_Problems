class Solution {
    public static int balanceSums(int[][] mat) {
        int maxrowsum=0;
        //for sum of all rows
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[i].length;j++){
                sum=sum+mat[i][j];
            }
            maxrowsum=Math.max(maxrowsum,sum);
        }
        //for sum of all columns
        int maxcolsum=0;
        //to iterate at every index of mat...
        for(int i=0;i<mat[0].length;i++){
            int sum=0;
            for(int j=0;j<mat.length;j++){
                 sum=sum+mat[j][i];
            }
             maxcolsum=Math.max(maxcolsum,sum);
        }
        int targetsum=Math.max(maxcolsum,maxrowsum);
        int opn=0;
         for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[i].length;j++){
                sum=sum+mat[i][j];
            }
            opn=opn+(targetsum-sum);
        }
       return opn; 
    }
}
