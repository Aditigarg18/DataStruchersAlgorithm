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
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        return arr[n-2];
    }
}

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int maxi=arr[0];
        int maxi1=-1;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(maxi<arr[i]){
            maxi1=maxi;
            maxi=arr[i];
        }
           else if(arr[i]<maxi && arr[i] > maxi1 )
                   maxi1=arr[i];
        }
        return maxi1;
    }
    
}
