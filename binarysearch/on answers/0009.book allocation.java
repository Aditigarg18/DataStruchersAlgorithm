class Solution {
    public int findPages(int[] arr, int k) {
        // code here
         if (k > arr.length) return -1;
        int low=0;
        int high=0;
       for(int i=0;i<arr.length;i++){
          low=Math.max(arr[i],low);
          high+=arr[i];
       }
       while(low<=high){
           int mid=(low+high)/2;
           if(ispossible(arr,mid)>k){
               low=mid+1;
           }
           else{
               high=mid-1;
           }
       }
       return low;
    }
    public int ispossible(int []arr,int pages){
        int student =1;
        long pageStudent=0;
        for(int i=0;i<arr.length;i++){
            if(pageStudent+arr[i]<=pages){
                pageStudent+=arr[i];
            }
            else{
                student++;
                pageStudent=arr[i];
            }
        }
        return student;
    }
}
