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
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next !=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode start = slow.next;
        ListNode prev = null;
        ListNode next = prev;

        while(start!=null)
        {
            next = start.next;
            start.next =prev;

            prev=start;
            start = next;
        }
        ListNode temp = head;

        while(temp!=null && prev!=null )
        {
            if(temp.val!=prev.val)
            return false;

            temp=temp.next;
            prev=prev.next;
        }
        return true;
}
}