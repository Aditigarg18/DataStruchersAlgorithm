class Solution {
    public int median(int[][] mat) {
        // code here
        int n = mat.length, m = mat[0].length;
        int[] arr = new int[n * m];
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[k++] = mat[i][j];
            }
        }

        Arrays.sort(arr);
        return arr[(n * m) / 2];
    }
}
