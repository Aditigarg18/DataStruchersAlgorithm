class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=nums.length-1;
        // for(int i=0;i<nums.length;i++){
         while(j<=k){
            if(nums[j]==1)j++;
            else if(nums[j]==2){
                swap(nums,j,k);
                k--;
            }
            else{
                swap(nums,i,j);
                i++;
                j++;
            }
         }
    }
    public void swap(int nums[],int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}
