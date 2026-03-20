class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        if(head==null){
            if(pos==1){
                return new Node(val);
            }
            else{
                return null;
            }
        }
        if(pos==1){
            Node temp=new Node(val);
             temp.next = head; 
            return temp;
        }
        int count=0;
      Node temp=head;
        while(temp!=null){
            count++;
            if(count==pos-1){
                Node x=new Node(val);
                x.next=temp.next;
                temp.next=x;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
}
