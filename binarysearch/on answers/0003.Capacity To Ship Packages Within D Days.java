class Solution {
    public int shipWithinDays(int[] weights, int days) {
               int maxi = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            maxi = Math.max(maxi, weights[i]);
        }
          int low=maxi;
          int high=sum;
          while(low<=high){
            int mid=(low+high)/2;
            if(possible(weights,mid)<=days){
               high=mid-1;
            }else{
                low=mid+1;
            }
           
          }
           return low;
    }
    
    public int possible(int[] weights,int mid){
        int n=weights.length;
        int day=1;
        int load=0;
        for(int i=0;i<n;i++){
            if(load+weights[i]>mid){
                day++;
                load=weights[i];
            }else{
                load+=weights[i];
            }
        }

          return day;
    }
}
