class Solution {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==0)count0++;
            else if(nums[i]==1)count1++;
            else count2++;
        }
        int index=0;
        while(count0!=0){
            nums[index++]=0;
            count0--;
        }
         while(count1!=0){
            nums[index++]=1;
            count1--;
        }
         while(count2!=0){
            nums[index++]=2;
            count2--;
        }

     
    }
}
class Solution {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==0)count0++;
            else if(nums[i]==1)count1++;
            else count2++;
        }
      for(int i=0;i<count0;i++){
        nums[i]=0;
      }
         for(int i=count0;i<count0+count1;i++){
        nums[i]=1;
      }
       for(int i=count0+count1;i<nums.length;i++){
        nums[i]=2;
      }
     
    }
}
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
