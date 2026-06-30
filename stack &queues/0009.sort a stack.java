class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        if (st.isEmpty()) return st; 
        // Pop the top element 
        int top = st.pop(); 
        // Recursively sort the rest 
        // of the stack.
        sort(st); 
        // Now, add the popped element 
        // into its correct sorted position. 
        Stack<Integer> tmp = new Stack<>();
        while (!st.isEmpty() && st.peek() > top)
        { 
            tmp.push(st.pop());
            }
            // Push the popped value
            st.push(top);
            // Now add the rest of values 
            // to the top. 
            while (!tmp.isEmpty()) {
                st.push(tmp.pop());
                } 
                return st;
    }
}
