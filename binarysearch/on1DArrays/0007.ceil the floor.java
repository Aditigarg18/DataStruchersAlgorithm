class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int floor=-1;
        int ceil=Integer.MAX_VALUE;
        int ans[]=new int [2];
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--){
            
            if(arr[i]<=x) {
            floor=Math.max(floor,arr[i]);
            }
            
          if(arr[i]>=x){
            ceil=Math.min(ceil,arr[i]);
          }
        }
          if(ceil==Integer.MAX_VALUE){
              ceil=-1;
          }
          
            ans[1]=ceil;
           ans[0]=floor;

        return ans;
    }
}

