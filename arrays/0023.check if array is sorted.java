class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        boolean ans=true;
        for(int i=1;i<arr.length;i++){
        if(arr[i-1]>arr[i]){
            ans=false;
            break;
        }
        }
        return ans;
    }
}
