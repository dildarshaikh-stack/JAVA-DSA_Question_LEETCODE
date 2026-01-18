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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode f=head.next;
        ListNode s=head;
        ListNode newHead = f;
        ListNode prev = null;
        while (f != null && s != null) {
            ListNode node = f.next;
            f.next = s;
            s.next = node;
            if (prev != null) {
                prev.next = f;
            }
            prev = s;
            s = node;
            if (s != null) {
                f = s.next;
            } else {
                f = null;
            }
        }

        return newHead;
    }
}