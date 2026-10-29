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




// Another solution
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                current.next=l2;
                l2=l2.next;
            }
            else{
                current.next=l1;
                l1=l1.next;
            }
            current=current.next;
        }
        if(l1!=null){
            current.next=l1;
        }
        else{
            current.next=l2;
        }
        return dummy.next;
    }
}