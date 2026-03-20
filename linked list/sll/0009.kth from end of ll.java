/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        int count=0;
        Node temp=head;
        int ans=-1;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int count1=count-k+1;
        int count2=0;
        temp=head;
         while(temp!=null){
            count2++;
            if(count2==count1){
               ans=temp.data;
            }
            temp=temp.next;
        }
        return ans;
    }
}
