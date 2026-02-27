class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        
       int window_sum=0;
       int maxsum=0;
       for(int i=0;i<k;i++){
           window_sum+=arr[i];
       }
        maxsum = window_sum;
        for(int i=k;i<arr.length;i++){
       window_sum+=arr[i];
       window_sum-=arr[i-k];
        maxsum=Math.max(maxsum,window_sum);
    }
   return maxsum;
}
}
