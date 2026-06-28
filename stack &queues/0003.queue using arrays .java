class myQueue {
    int q[];
    int cursize=0;
    int start=-1,end=-1;
    int n;
    // Constructor
    public myQueue(int n) {
        this.n=n;
        // Define Data Structures
        q=new int[n];
    }

    public boolean isEmpty() {
        return cursize==0;
        // Check if queue is empty
    }

    public boolean isFull() {
        return cursize==n;
        // Check if queue is full
    }

    public void enqueue(int x) {
        // Enqueue
       
        if(cursize==0){
            start=0;
            end=0;
        }
        else{
            end=(end+1)%n;
        }
         q[end]=x;
            cursize+=1;
    }

    public void dequeue() {
        // Dequeue
       if (isEmpty()) return;

        if (cursize == 1) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % n;
        }

        cursize--;
    }

    public int getFront() {
         if (isEmpty()) return -1;
        return q[start];
        // Get front element
    }

    public int getRear() {
         if (isEmpty()) return -1;
        return q[end];
        // Get last element
    }
}
