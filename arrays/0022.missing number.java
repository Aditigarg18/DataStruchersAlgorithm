
class Solution {
    int missingNum(int arr[]) {
        // code here
        int xor=0,xor1=0;
        int n=arr.length+1;
       for(int i=0;i<arr.length;i++){
           xor=xor^(i+1);
           xor1=xor1^arr[i];
       }
       xor=xor^n;
       return xor^xor1;
    }
}
//tle
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum1=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
           sum2=sum2+nums[i];
        }
        return sum1-sum2;
    }
}
class Solution {
    int missingNum(int arr[]) {
        // code here
        int xor=0,xor2=0;
        int n=arr.length+1;
       for(int i=0;i<n;i++){
           xor=xor^(i+1);
       }
       for(int i=0;i<arr.length;i++){
           xor2=xor2^arr[i];
       }
       return xor^xor2;
    }
}
