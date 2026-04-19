class Solution {
    public void rotate(int[] nums, int k) {
//right rotation
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        //left      reverse(arr, 0, d - 1);     // step 1
       // reverse(arr, d, n - 1);     // step 2
       // reverse(arr, 0, n - 1); 
    }
    public void reverse(int[]nums,int start,int end){
        while(start<=end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
    }
    }
}
