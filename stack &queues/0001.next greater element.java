class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n=arr.length;
        int nge[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty())
             nge[i]=-1;
             else nge[i]=st.peek();
            st.push(arr[i]);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int x:nge)
        ans.add(x);
        return ans;
    }
}
