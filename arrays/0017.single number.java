class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
          ans=ans^nums[i];
        }
        return ans;
    }
}
//brute force
       class Solution {
    public int singleNumber(int[] nums) {
        int num=0,count=0,ans=0;
        for(int i=0;i<nums.length;i++){
           num=nums[i];
            count=0;
        for(int j=0;j<nums.length;j++){
            if(num==nums[j])
            count++;
        }
         if (count==1) return num;
    }
    return -1;
}
       }
//better-will not work for negative
class Solution {
    public int singleNumber(int[] nums) {
     int maxi=nums[0];
     for(int i=0;i<nums.length;i++){
        maxi=Math.max(nums[i],maxi);
     }   
     int[]hash=new int[maxi+1];
     for(int i=0;i<nums.length;i++){
        hash[nums[i]]++;
     }
     for(int i=0;i<nums.length;i++){
        if(hash[nums[i]]==1)
           return nums[i];
     }
     return -1;
    }
}
