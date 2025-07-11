class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0;
        int right=matrix.length-1;
        if(left==right){
            left=0;
            right=matrix[0].length-1;
            while(left<=right){
                int tempmid=(left+right)/2;
                if(matrix[0][tempmid]==target){
                    return true;
                }else if(matrix[0][tempmid]<target){
                    left=left+1;
                }else{
                    right=right-1;
                }
            }
            return false;
        }
        while(left<=right){
            int mid=(left+right)/2;
            if(matrix[mid][0]<=target&&matrix[mid][matrix[mid].length-1]>=target){
                left=0;
                right=matrix[mid].length-1;
            while(left<=right){
                int tempmid=(left+right)/2;
                if(matrix[mid][tempmid]==target){
                    return true;
                }else if(matrix[mid][tempmid]<target){
                    left=tempmid+1;
                }else{
                    right=tempmid-1;
                }
            }
        }else if(target<matrix[mid][0]){
            right=mid-1;
        }else{
            left=mid+1;
        }
    }
    return false;
}
}
