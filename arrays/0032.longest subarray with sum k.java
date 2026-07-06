// User function Template for Java
//brute force
class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        //brute force
        int sum=0;
        int  maxi=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==k)
                maxi=Math.max(maxi,j-i+1);
            }
        }
        return maxi;
    }
}
//gives tle
class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        
        int sum = 0;
        int length = 0;
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            
            sum += arr[i];
            
            if(sum == k)
                length = Math.max(length, i + 1);
            
            if(!mp.containsKey(sum))
                mp.put(sum, i);
            
            if(mp.containsKey(sum - k))
                length = Math.max(length, i - mp.get(sum - k));
        }
        
        return length;
    }
}   
 
