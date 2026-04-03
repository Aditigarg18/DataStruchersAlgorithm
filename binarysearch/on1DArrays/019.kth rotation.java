class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                return i;
            }
        }
        return 0;
    }
}
