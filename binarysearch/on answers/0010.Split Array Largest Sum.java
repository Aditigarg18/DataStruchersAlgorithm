class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if (ispossible(nums,mid)<=k){
              ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public int ispossible(int []arr,int mid){
        int count=1;
        int tempsum=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if(tempsum+arr[i]<=mid){
                tempsum+=arr[i];
            }
            else{
                count++;
                tempsum=arr[i];
            }
        }
        return count;
    }
}
