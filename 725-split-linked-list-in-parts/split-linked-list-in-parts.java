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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] arr=new ListNode[k]; 
        int len=getLen(head);
        int base = len / k;
        int extra = len % k;
        ListNode temp=head;
        for(int i=0;i<k;i++){
             if (temp == null) {
                arr[i] = null;
                continue;
            }
            arr[i] = temp; 
            int partSize = base + (i < extra ? 1 : 0);
            for (int j = 1; j < partSize; j++) {
                temp = temp.next;
            }
            ListNode node = temp.next;
            temp.next = null;
            temp = node;
        }
        return arr;
    }
    public int getLen(ListNode head){
        if(head==null){
            return 0;
        }
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        return len;
    }
}