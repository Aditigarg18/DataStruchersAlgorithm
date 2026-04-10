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
    public boolean isPalindrome(ListNode head) {
        //1st find the middle elemnt
        //2nd reverse the ll
        //3rd compare 1st and second and equal ll is pallindrome else not.
        if(head==null || head.next==null) return true;
        //find middle
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverse second half
        ListNode prev=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        //3.compare first and second half
        ListNode first=head;
        ListNode second=prev;
        while(second!=null){
            if(first.val!=second.val) return false;
                first=first.next;
                second=second.next;
            }
            return true;
            }
}
