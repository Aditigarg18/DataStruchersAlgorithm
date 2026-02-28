class Solution {
    public boolean isPossible(int mid,int[]weights,int days){
        int count=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
        if(sum>mid){
           count++;
           sum=weights[i];
        }
    }
    return count<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxcapacity=0;
        for(int w:weights){
            maxcapacity+=w;
        }
        int low=0;
        for(int w:weights){
            low=Math.max(low,w);
        }
        int high=maxcapacity;
        int result=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(mid,weights,days)){
            result= mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        }
        return result;
    }
}
