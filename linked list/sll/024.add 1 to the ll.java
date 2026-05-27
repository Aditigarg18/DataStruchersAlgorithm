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
//APPROACH-2

class Solution {
    public Node addOne(Node head) {
        // code here.
        int carry=helper(head);
        if(carry==1){
            Node newnode=new Node(1);
            newnode.next=head;
            return newnode;
        }
        return head;
    }
    public int helper(Node temp){
        if(temp==null) return 1;
        int carry=helper(temp.next);
        temp.data=temp.data+carry;
        if(temp.data<10)
           return 0;
        temp.data=0;
        return 1;
    }
}
