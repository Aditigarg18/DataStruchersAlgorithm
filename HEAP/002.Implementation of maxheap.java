class maxHeap {
       ArrayList<Integer>arr;
    // Constructor
    public maxHeap() {
        arr=new ArrayList<>();
        // Initialize your data members
    }

    public void push(int x) {
        arr.add(x);
        Collections.sort(arr);//small-big
        // Insert x into the heap
    }

    public void pop() {
        if(!arr.isEmpty()){
            arr.remove(arr.size()-1);
        }
        // Remove the top (maximum) element
    }

    public int peek() {
        if(arr.isEmpty()){
            return -1;
        }
        return arr.get(arr.size()-1);
        // Return the top element or -1 if empty
    }

    public int size() {
        return arr.size();
        // Return the number of elements in the heap
    }
}
