// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    Node start;
    Node end;
    int size;
    public myQueue() {
        start=null;
        end=null;
        size=0;
        // Initialize your data members
    }

    public boolean isEmpty() {
        return start==null;
        // check if the queue is empty
    }

    public void enqueue(int x) {
        Node temp=new Node(x);
        if(start==null){
            start=temp;
            end=temp;
        }
        else{
            end.next=temp;
            end=temp;
        }
        size++;
        // Adds an element x at the rear of the queue.
    }

    public void dequeue() {
        if(isEmpty())return;
        start=start.next;
        size--;
        // Removes the front element of the queue
    }

    public int getFront() {
          if(isEmpty())return-1;
        return start.data;
        // Returns the front element of the queue.
        // If queue is empty, return -1.
    }

    public int size() {
        return size;
        // Returns the current size of the queue.
    }
}
