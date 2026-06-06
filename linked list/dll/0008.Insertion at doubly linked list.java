class Solution {
    Node insertAtPos(Node head, int p, int x) {
        Node curr=head;
        for(int i=0;i<p;i++){
            curr=curr.next;
        }
        Node newnode=new Node(x);
        newnode.next=curr.next;
        newnode.prev=curr;
        if(curr.next!=null){
            curr.next.prev=newnode;
        }
        curr.next=newnode;
        return head;
    }
}
