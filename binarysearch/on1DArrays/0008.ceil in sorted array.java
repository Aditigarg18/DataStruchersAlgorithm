class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int ceil=-1;
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
          if(arr[i]>=x)
              ceil=i;
              
        }
        return ceil;
    }
}
