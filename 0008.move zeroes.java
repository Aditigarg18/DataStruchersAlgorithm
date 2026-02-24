class Solution {
    public void moveZeroes(int[] nums) {
          int n=nums.length;
          int movezeroes=0;
          for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[movezeroes];
                nums[movezeroes]=nums[i];
                nums[i]=temp;
                movezeroes++;
            }
                
          }

    }
}
