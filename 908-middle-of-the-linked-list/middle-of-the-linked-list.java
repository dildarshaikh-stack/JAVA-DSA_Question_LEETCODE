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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int middle=0;
        ListNode temp1=head;
        ListNode node=new ListNode();
        while(middle<length/2){
            middle++;
            temp1=temp1.next;
        }
        node.next=temp1;
        return node.next;
    }
}