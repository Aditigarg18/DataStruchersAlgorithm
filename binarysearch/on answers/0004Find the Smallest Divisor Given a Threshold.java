class Solution {
    public boolean divisor(int []nums,int threshold,int divisior){
        int ans=0;
        for(int array:nums){
            ans += (array + divisior - 1) / divisior;
        }
            return ans<=threshold;
        }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        for(int w:nums){
             high=Math.max(w,high);
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(divisor(nums,threshold,mid)){
                 high=mid-1;
        }
        else{
            low=mid+1;
        }
        }
        return low;
    }
}
