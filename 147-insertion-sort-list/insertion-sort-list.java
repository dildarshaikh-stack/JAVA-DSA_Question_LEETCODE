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
    public ListNode insertionSortList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        for(int i=0;i<len(head);i++){
            while(fast!=null ){
                if(slow.val>fast.val){
                    int temp = slow.val;
                    slow.val = fast.val;
                    fast.val = temp;
                }
                fast=fast.next;
                slow=slow.next;
            }
            fast=head.next;
            slow=head;
        }
        return head;
    }
    public int len(ListNode head){
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        return len;
    }
}