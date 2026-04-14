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
    public ListNode oddEvenList(ListNode head) {
        //1->2->3->4->5
       // 1->3->5  2->4
//        odd       even
        //odd->index.next to even->index
        // odd index                    even index
        //odd head   null  1   3                even head null  2
        //odd tail  null   1   3(odd tail.next=head)                                      even tail  null   2  4(even.tail-next)
          ListNode oddh = null, evenh = null;
        ListNode oddt = null, event = null;

        int count = 1;

        while (head != null) {
            // ListNode nextNode = head.next; // save next
            // head.next = null; // 🔥 break old link

            if (count % 2 == 0) {
                if (evenh == null) {
                    evenh = head;
                    event = head;
                    head=head.next;
                } else {
                    event.next = head;
                    event = event.next;
                    head=head.next;
                }
            } else {
                if (oddh == null) {
                    oddh = head;
                    oddt = head;
                    head=head.next;
                } else {
                    oddt.next = head;
                    oddt = oddt.next;
                    head=head.next;
                }
            }
            count++;
        }

        // edge cases
        if (oddh == null) return evenh;
        if (evenh == null) return oddh;

        // connect odd and even
        event.next=null;
        oddt.next = evenh;

        return oddh;
    }
}
