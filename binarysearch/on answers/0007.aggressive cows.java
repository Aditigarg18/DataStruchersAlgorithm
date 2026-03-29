class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int low=1;
        int n=stalls.length;
          int ans=0;
        Arrays.sort(stalls);
        int high=stalls[n-1]-stalls[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(canPlace(stalls,k,mid)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static boolean canPlace(int[]stalls,int k,int dist){
        int count=1;
        int last=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-last>=dist){
                count++;
                last=stalls[i];
            }
            if(count>=k)return true;
        }
        return false;
    }
}
