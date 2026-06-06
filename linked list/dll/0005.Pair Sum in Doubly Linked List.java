/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
    ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
    if(head==null)return ans;
    //1.finding the tail of the linked list.
    Node left=head;
    Node right=head;
    while(right.next!=null){
        right=right.next;
    }
    //2.apply 2 pointer approach
    while(left!=null && right!=null && left.data<right.data){
        int currentsum=left.data+right.data;
        
        if(currentsum==target){
            ArrayList<Integer>pair=new ArrayList<>();
            pair.add(left.data);
            pair.add(right.data);
            ans.add(pair);
            left=left.next;
            right=right.prev;
        }
        else if(currentsum<target){
            left=left.next;
        }
        else right=right.prev;
    }
    return ans;
    }
}
