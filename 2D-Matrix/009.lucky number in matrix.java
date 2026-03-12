class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
    ArrayList<Integer>ans=new ArrayList<>();
     int m=matrix.length;
     int n=matrix[0].length;
     for(int i=0;i<m;i++){
        int minval=Integer.MAX_VALUE;
        int colindex=-1;
        for(int j=0;j<n;j++){
            if(matrix[i][j]<minval){
                minval=matrix[i][j];
                colindex=j;
            }
        }
        boolean islucky=true;
        for(int k=0;k<m;k++){
            if(matrix[k][colindex]>minval){
                islucky=false;
                break;
            }
        }
        if(islucky){
        ans.add(minval);
     }
    }
    return ans;
}
}
