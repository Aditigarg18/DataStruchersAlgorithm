/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // Create a dummy node to handle edge cases
        ListNode dummy=new ListNode(0);
        // Pointer to the tail of the last reversed group
        dummy.next=head;
        ListNode groupprev=dummy;
        while(true){
            // Get the k-th node in the current group
            ListNode kth=getkthnode(groupprev,k);
            if(kth==null)break;
            // Store the next group’s head
            ListNode groupnext=kth.next;
            // Reverse the current k-group
            ListNode prev=groupnext;
            ListNode curr=groupprev.next;
            for(int i=0;i<k;i++){
                ListNode temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            // Connect the previous group to the reversed group
               ListNode temp=groupprev.next;
               groupprev.next=kth;
               groupprev=temp;
        }
         // Return the new head
        return dummy.next;
        }
        // Helper function to get the k-th node from the current node
        private ListNode getkthnode(ListNode curr,int k){
            while(curr!=null && k>0){
                curr=curr.next;
                k--;
            }
            return curr;
    }
}
