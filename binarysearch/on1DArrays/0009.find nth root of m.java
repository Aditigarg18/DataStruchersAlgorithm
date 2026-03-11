class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int low=1;
        int high=m;
           if(m == 0) return 0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int val=1;
            for(int i = 0; i < n; i++){
                val *= mid;
                if(val > m) break;
            }
            if(val==m){
             return mid;
            }
            else if(val<m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
