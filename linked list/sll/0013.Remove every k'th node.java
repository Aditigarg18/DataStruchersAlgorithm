class Solution {
    /*You are required to complete this method*/
    Node deleteK(Node head, int k) {
        // Your code here
        if(head==null||k<=0) return head;
        if(k==1)return null;
        
        Node curr=head;
        Node prev=null;
        int count=1;
            
        while(curr!=null){
            if(count%k==0){
                prev.next=curr.next;
            }
            else{
                prev=curr;
            }
            curr=curr.next;
            count++;
        }
        return head;
    }
}
