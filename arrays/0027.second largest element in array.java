class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int maxi=0;
        int second=0;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
        }
         for(int i=0;i<arr.length;i++){
             if(arr[i]<maxi){
               second=Math.max(arr[i],second);
             }
    }
    return second;
    }
}
