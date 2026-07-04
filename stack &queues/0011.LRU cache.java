class LRUCache {
        HashMap<Integer,Node>mpp=new HashMap<>();
        int capacity;
        Node head=new Node(0,0);
        Node tail=new Node(0,0);
    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!mpp.containsKey(key))return -1;
        else {
        Node node=mpp.get(key);
        delete(node);
         insertAfterHead(node);
        return node.val;

        }
    }
    
    public void put(int key, int value) {
        if(mpp.containsKey(key)){
            Node node=mpp.get(key);
            node.val=value;
            delete(node);
            insertAfterHead(node);
        }
        else{
            if(mpp.size()==capacity){
                Node node=tail.prev;
                mpp.remove(node.key);
                delete(node);
            }
            Node node=new Node(key,value);
            mpp.put(key,node);
            insertAfterHead(node);
        }
    }
    public void insertAfterHead(Node node){
        Node curAfterHead=head.next;
        head.next=node;
        node.prev=head;
        node.next=curAfterHead;
        curAfterHead.prev=node;
    }
    public void delete(Node node){
    Node  prevnode=node.prev;
    Node  afternode=node.next;
        prevnode.next=afternode;
        afternode.prev=prevnode;
    }
    class Node{
        int key;
        int val;
        Node prev;
        Node next;
        Node (int key,int val){
            this.key=key;
            this.val=val;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
