/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
       Node temp=head;
       int count0=0,count1=0,count2=0;
       while(temp!=null){
           if (temp.data==0) count0++;
           else if(temp.data==1)count1++;
           else count2++;
           temp=temp.next;
       }
       temp=head;
       while(temp!=null){
           if(count0>0){
               temp.data=0;
               count0--;
           }
           else if(count1>0){
               temp.data=1;
               count1--;
           }
           else {
               temp.data=2;
               count2--;
           }
           temp=temp.next;
       }
       return head;
    }
}
