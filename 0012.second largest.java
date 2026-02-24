class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans)
            ans=arr[i];
        }
        int second=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=ans)
            second=Math.max(arr[i],second);
        }
        return second;
    }
}
