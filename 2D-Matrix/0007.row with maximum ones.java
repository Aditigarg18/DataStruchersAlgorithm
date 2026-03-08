class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnes = 0;
        int rowIndex = 0;
        for(int i=0;i<mat.length;i++){
            int count1=0;
            for(int j=0;j<mat[0].length;j++){
                 if(mat[i][j]==1){
                    count1++;
            }
        }
        if(count1 > maxOnes) {
           maxOnes = count1;
           rowIndex = i;
            }
        }

        return new int[]{rowIndex, maxOnes};
    }
}
