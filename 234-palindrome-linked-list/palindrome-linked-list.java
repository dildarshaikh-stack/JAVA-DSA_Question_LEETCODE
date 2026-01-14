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
         ListNode mid=middleNode(head);
         ListNode headSec=reversal(mid);
         ListNode reverseHead=headSec;
         while(head!=null && headSec != null){
            if(head.val != headSec.val){
                return false;
            }
             head = head.next;     
            headSec = headSec.next; 
         }
         return true;
    }
    public ListNode reversal(ListNode head){
        if(head==null){
            return head;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode Next=pres.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=Next;
            if(Next!=null){
                Next=Next.next;
            }
        }
        head=prev;
        return head;
}
public ListNode middleNode(ListNode head){
    ListNode s=head;
    ListNode f=head;
    while(f!= null && f.next!=null){
        s=s.next;
        f=f.next.next;
    }
    return s;
}
}