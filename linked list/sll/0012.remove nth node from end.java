class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            if(count==n){
                ListNode newhead=head.next;
                return newhead;
            }
        }
            int res=count-n;
            temp=head;
            while(temp!=null){
                res--;
                if(res==0)break;
                temp=temp.next;
            }
         ListNode delNode=temp.next;
         temp.next=temp.next.next;
         return head;
    }
}
