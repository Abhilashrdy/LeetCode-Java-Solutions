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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)return null;
       ListNode temp = head;
       ListNode midP = null;
       while(temp != null && temp.next != null){
        midP = (midP == null)?head:midP.next;
        temp = temp.next.next;
       }
       midP.next = midP.next.next;
        return head;
    }
}
