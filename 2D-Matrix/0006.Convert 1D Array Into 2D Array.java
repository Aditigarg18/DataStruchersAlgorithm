class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int ans[][]=new int[m][n];
         if(original.length != m*n) return new int[0][0];
        for(int i=0;i<original.length;i++){
            int newr=i/n;
            int newc=i%n;
            ans[newr][newc]=original[i];
        }
        return ans;
    }
}
