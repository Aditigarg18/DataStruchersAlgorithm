class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int [][]ans=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=matrix[i][j];
                }
            }
        for(int j=0;j<n;j++){
            int maxi=0;
            for(int i=0;i<m;i++){
                if(ans[i][j]!=-1){
             maxi=Math.max(maxi,matrix[i][j]);
            }
        }
        for(int i=0;i<m;i++){
             if(ans[i][j] == -1){
                    ans[i][j] = maxi;
    }
}
        }
        return ans;
    }
}
