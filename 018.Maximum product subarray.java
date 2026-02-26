class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        int prod=1;
        for(int i=0;i<nums.length;i++){
            prod=prod*nums[i];
            maxi=Math.max(prod,maxi);
            if(prod==0)
            prod=1;
        }
       prod=1;
        for(int i=n-1;i>=0;i--){
            prod=prod*nums[i];
            maxi=Math.max(prod,maxi);
            if(prod==0)
            prod=1;
        }
        return maxi;
    }
}
