class Solution {
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        // Code here
        PriorityQueue <Integer>minheap=new PriorityQueue<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                minheap.offer(mat[i][j]);
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        while(!minheap.isEmpty()){
         ans.add(minheap.poll());
        }
        return ans;
    }
}
