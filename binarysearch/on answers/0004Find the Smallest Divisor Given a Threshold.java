class Solution {
      public boolean isAns(int[] nums, int k, int ans){
        int sum = 0;
        for(int num : nums){
            sum += Math.ceil((double)num/ans); 
        }
        return sum<=k;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        // Exact same as Leetcode - 875 KoKo Eating Bananas
        int l = 1;
        int r = Integer.MIN_VALUE;
        for(int num : nums){
            l = Math.min(l, num);
            r = Math.max(r, num);
        }
        int ans = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isAns(nums, threshold, mid)){
                ans = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
}
