/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
*/
// Stack class
class myStack {

    Node top;
    int size;
    public myStack() {
    top=null;
   size=0;
        // Initialize your data members
    }

    public boolean isEmpty() {
       return top==null;
        // check if the stack is empty
    }

    public void push(int x) {
        Node temp=new Node(x);
        temp.next=top;
        top=temp;
        size=size+1;
        // Adds an element x at the rear of the stack.
    }

    public void pop() {
        Node temp=top;
        top=top.next;
        size=size-1;
        // Removes the front element of the stack.
    }

    public int peek() {
        if(isEmpty())return-1;
        return top.data;
        // Returns the front element of the stack.
        // If stack is empty, return -1.
    }

    public int size() {
        return size;
        // Returns the current size of the stack.
    }
}
