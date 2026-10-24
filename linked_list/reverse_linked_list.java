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
    public ListNode reverseList(ListNode head) {
        ListNode h=head;
        ListNode prev=null;
        while(h!=null){
            ListNode next=h.next;
            h.next=prev;
            prev=h;
            h=next;
        }
        return prev;
    }
}