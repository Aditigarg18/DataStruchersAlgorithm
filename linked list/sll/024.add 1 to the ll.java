//APPROACH-1
class Solution {
    public Node reverselist(Node node){
            Node prev=null;
            Node current=node;
            
            while(current!=null){
                Node temp=current.next;//5
                current.next=prev;
                prev=current;
                current=temp;
            }
            return prev;
            
    }
    public Node addOne(Node head) {
        // code here.
        head=reverselist(head);
        Node current=head;
        int carry=1;
        while(current!=null && carry>0){
            int sum=current.data+carry;
            current.data=sum%10;//0
            carry=sum/10;//1
        if(current.next==null && carry>0){
            current.next=new Node(carry);
            carry=0;
        }
        current=current.next;
        }
        head=reverselist(head);
        return head;
    }
    
}
