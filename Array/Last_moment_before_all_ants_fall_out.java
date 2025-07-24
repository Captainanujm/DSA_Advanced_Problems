class Solution {
    public int getLastMoment(int n, int left[], int right[]) {
        // code here
        int maxtime=0;
        for(int i=0;i<left.length;i++){
            maxtime=Math.max(maxtime,left[i]-0);
        }
        for(int i=0;i<right.length;i++){
            maxtime=Math.max(maxtime,n-right[i]);
        }
        return maxtime;
    }
}
