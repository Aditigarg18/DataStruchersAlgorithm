class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // 1.We created an array list of size n, and stored all element as -1.
// 2.we created a deque. started the traversal from last, so
// it easy to find the next greatest element.
// 3. if  in stack the topmost element less than array’s current index 
// value element-then pop .else return that element in arraylist ,
// then push the element.
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
