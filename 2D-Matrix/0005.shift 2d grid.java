lass Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int temp[][] =new int [m][n];
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                int newval=((r*n+c)+k)%(m*n);
                int newr=newval/n;
                int newc=newval%n;
                temp[newr][newc]=grid[r][c];                 
            }
        }
     List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < m; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < n; j++){
                row.add(temp[i][j]);
            }
            ans.add(row);
        }

        return ans;
    }
}
