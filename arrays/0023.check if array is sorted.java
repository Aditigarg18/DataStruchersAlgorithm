class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        boolean ans=true;
        for(int i=1;i<arr.length;i++){
        if(arr[i-1]>arr[i]){
            ans=false;
            break;
        }
        }
        return ans;
    }
}

class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int n=nums.length;
         for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) 
            count++;
         } 
         if(nums[n-1]>nums[0])count++;
         return count<=1;
    }
}
