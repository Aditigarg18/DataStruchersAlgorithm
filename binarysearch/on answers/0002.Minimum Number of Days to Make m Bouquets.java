class Solution {
    public int getNoOfBoquets(int []bloomday,int mid,int k){
        int noofBoquets=0;
        int count=0;
        for(int i=0;i<bloomday.length;i++){
            if(bloomday[i]<=mid){
                count++;
            }
            else{
                count=0;
            }
            if(count==k){
                noofBoquets++;
                count=0;
            }
        }
        return noofBoquets;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low=0,high=0;
        for(int day:bloomDay){
            high=Math.max(high,day);
        }
        int midday=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(getNoOfBoquets(bloomDay,mid,k)>=m){
                high=mid-1;
                midday=mid;
            }
            else{
                low=mid+1;
            }
        }
        return midday;
    }
}
