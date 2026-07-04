class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
               ans.add(0,-1);
            }
            else{
                ans.add(0,st.peek());
            }
                st.push(arr[i]);
        }
        return ans;
    }
}
