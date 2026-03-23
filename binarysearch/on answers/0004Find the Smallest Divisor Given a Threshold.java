class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=Arrays.stream(nums).max().getAsInt();
        while(left<right){
            int mid=left+(right-left)/2;
            if(possible(nums,mid,threshold)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public boolean possible(int []nums,int mid ,int threshold){
        int divisor=0;
          for(int num:nums){
       divisor=divisor+(num/mid); 
       if(num%mid!=0)divisor++;
          }
          return divisor<=threshold;
    }
}
