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
