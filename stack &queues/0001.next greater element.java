class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        //1.create an arrayList of all element of -1 intialized.
        //2.start from last.
        //[1, 3, 2, 4]
     // st push(4)
     //4 is last so -1.
     //now 2
     //st=[4,]
   int  n=arr.length;
     ArrayList<Integer>result=new ArrayList<>(Collections.nCopies(n,-1));
     Deque<Integer>stack=new ArrayDeque<>();
     for(int i=n-1;i>=0;i--){
         while(!stack.isEmpty()&&stack.peek()<=arr[i]){
             stack.pop();
         }
         if(!stack.isEmpty()){
             result.set(i,stack.peek());
         }
         stack.push(arr[i]);
     }
     return result;
    }
}
