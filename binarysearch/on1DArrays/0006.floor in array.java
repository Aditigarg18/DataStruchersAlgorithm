class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
           if(x>=arr[i])return i;
            }
            return -1;
    }
}
