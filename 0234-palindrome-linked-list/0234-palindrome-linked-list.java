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
        ListNode temp = head;
        ListNode temp2 = head;
        Stack<ListNode> st = new Stack<>() ;

        while(temp!=null)
        {
            st.push(temp);
            temp = temp.next;
        }
        while(temp2!=null)
        {
            if(temp2.val != st.peek().val)
            return false;

            temp2=temp2.next;
            st.pop();
        }
        return true;
}
}