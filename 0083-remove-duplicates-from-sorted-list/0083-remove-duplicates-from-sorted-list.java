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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
        ListNode c=head;
        while(c.next!=null&&c!=null)
        if(c.val==c.next.val)
        c.next=c.next.next;
        else
        c=c.next;
        return head;
    }
}