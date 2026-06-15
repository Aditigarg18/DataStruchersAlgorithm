class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n=arr.length;
        int i=0;
        int j=0;
        int cnt=0,maxcnt=0;
        while(i<n){
            if(arr[i]<=dep[j]){
                cnt=cnt+1;
                i++;
            }
            else{
                cnt=cnt-1;
                j++;
            }
            maxcnt=Math.max(maxcnt,cnt);
        }
        return maxcnt;
    }
}
