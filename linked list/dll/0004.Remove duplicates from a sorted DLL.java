class Solution {
    Node removeDuplicates(Node headRef) {
        // code here
        Node temp=headRef;
        while(temp!=null && temp.next!=null){
            Node nextnode=temp.next;
            while(nextnode!=null && nextnode.data==temp.data){
                nextnode=nextnode.next;
            }
            temp.next=nextnode;
            if(nextnode!=null)nextnode.prev=temp;
            temp=temp.next;
        }
        return headRef;
    }
}
