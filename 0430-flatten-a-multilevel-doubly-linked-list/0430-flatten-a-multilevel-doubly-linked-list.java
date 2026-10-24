/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {

    Node current = head;
    Node savenext = null;

    while(current!=null)
    {
        while(current.child!=null)
        {   savenext = current.next;
            Node childhead = flatten(current.child);
            current.next = childhead;
            childhead.prev = current;
            current.child = null;

            // finding tail

            while(current.next!=null){
            current = current.next;}

            if(savenext!=null){
            current.next = savenext;
            savenext.prev = current;
            }
        }
        current = current.next;
    }
    return head;     
    }
}