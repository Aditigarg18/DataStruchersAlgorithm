class Solution {
    public List<Integer> majorityElement(int[] nums) {
     ArrayList<Integer>ans=new ArrayList<>();
     int n=nums.length;
     int count2=0;
     int count1=0;
     int ele1=0;
     int ele2=0;
     for(int i=0;i<nums.length;i++){
         if(ele1==nums[i])count1++;
         else if (ele2==nums[i])count2++;
        else if(count1==0){
         ele1=nums[i];
        count1=1;
        }
        else if(count2==0){
         ele2=nums[i];
        count2=1;
        }
        else {
            count1--;
            count2--;
        }
        }
       count1=0;
       count2=0;
      for(int i=0;i<nums.length;i++){
             if(ele1==nums[i])count1++;
             else if(ele2==nums[i])count2++;
      }
            if(count1>n/3)ans.add(ele1);
            if(count2>n/3)ans.add(ele2);
            return ans;
    }
}
