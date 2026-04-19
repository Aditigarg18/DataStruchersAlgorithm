class Solution {
    public void rotate(int[] arr) {
        // code here
   int n = arr.length;
         //for right rotation store last element and traverse from last and shift element 
        //for left rotation store first element and traverse from start and shift element
        int last = arr[n - 1]; // store last element
        
        // shift elements right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        
        // put last element at front
        arr[0] = last;
    }
    
}
