class Solution {
    public static int largest(int[] arr) {
        // code here
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
              max=arr[i];
        }
        return max;
    }
}

class Solution {
    public static int largest(int[] arr) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        return arr[n-1];
    }
}
