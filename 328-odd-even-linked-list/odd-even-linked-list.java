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
        if(head==null || head.next==null){
            return head;
        }
        ListNode s=head;
        ListNode f=head.next;
        ListNode node=f;
        while(f!=null && f.next!=null){
            s.next=f.next;
            s=f.next;
            f.next=s.next;
           f=s.next;
        }
        s.next=node;
        return head;

    }
}