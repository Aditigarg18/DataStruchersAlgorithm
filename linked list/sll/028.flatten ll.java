/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
        // code here
           // Merge two sorted linked lists (by child pointers)
    private Node merge(Node list1, Node list2) {
        Node dummyNode = new Node(-1);
        Node res = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                res.bottom = list1;
                res = list1;
                list1 = list1.bottom;
            } else {
                res.bottom = list2;
                res = list2;
                list2 = list2.bottom;
            }
            res.next = null;
        }

        if (list1 != null) res.bottom = list1;
        else res.bottom = list2;

        if (dummyNode.bottom!= null) {
            dummyNode.bottom.next = null;
        }

        return dummyNode.bottom;
    }

    // Flatten a multi-level linked list
     public Node flatten(Node root) {
        if (root == null || root.next == null) {
            return root;
        }

        Node mergedHead = flatten(root.next);
        return merge(root, mergedHead);
    }
}
  
