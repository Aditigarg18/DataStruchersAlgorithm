class Solution {
    public int firstcount(int arr[],int target){
      int start=0;
      int n=arr.length;
      int end=n-1;
      int ans=-1;
      while(start<=end){
          int mid=(start+end)/2;
          if(arr[mid]==target){
              ans=mid;
              end=mid-1;
          }
          else if(arr[mid]>target){
              end=mid-1;
          }
          else{
              start=mid+1;
          }
      }
      return ans;
    }
     public int lastcount(int arr[],int target){
      int start=0;
      int n=arr.length;
      int end=n-1;
      int ans=-1;
      while(start<=end){
          int mid=(start+end)/2;
          if(arr[mid]==target){
              ans=mid;
              start=mid+1;
          }
          else if(arr[mid]>target){
                end=mid-1;
          }
          else{
               start=mid+1;
          }
      }
      return ans;
    }
    int countFreq(int[] arr, int target) {
        // code here
    if(firstcount(arr,target)==-1 && lastcount(arr,target)==-1) return 0;
    return lastcount( arr, target)-firstcount(arr,target)+1;
    }
}

