class Solution {
    public int trap(int[] height) {
        int lmax=0,rmax=0,total=0;
        int right=height.length-1,left=0;
        while(left<right){
            if(height[left]<=height[right]){
                if(lmax>height[left])
                   total+=(lmax-height[left]);
                   else{
                    lmax=height[left];
                   }
                   left=left+1;
            }
            else{
                if(rmax>height[right])
                total+=(rmax-height[right]);
                else{
                    rmax=height[right];
                }
                right=right-1;
            }
        }
        return total;
    }
}
