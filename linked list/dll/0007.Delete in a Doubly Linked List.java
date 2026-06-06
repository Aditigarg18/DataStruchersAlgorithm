class Solution {
    public Node delPos(Node head, int x) {
        // code here
      Node curr=head;
      
      for(int i=1;i<x;i++){
          curr=curr.next;
      }
      if(curr==head){
          head=head.next;
          if(head!=null){
              head.prev=null;
          }
      }
          else{
              curr.prev.next=curr.next;
              if(curr.next!=null)
              curr.next.prev=curr.prev;
      }
      return head;
    }
}
