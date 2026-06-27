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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1R = reverseList(l1);
        ListNode l2R = reverseList(l2);
        ListNode ans = addTwoNumbers1(l1R,l2R);
        return reverseList(ans); 
    }
    private ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        if(l1 == null)return l2;
        if(l2 == null)return l1;
        ListNode node = new ListNode();
        ListNode head = node;
        int carry = 0;
        while(l1 != null && l2 != null){
            node.next = new ListNode((l1.val+l2.val+carry)%10);
            carry = (l1.val+l2.val+carry)/10;
            l1 = l1.next;
            l2 = l2.next;
            node = node.next;
        }
        while( l2 != null){
            node.next = new ListNode((l2.val+carry)%10);
            carry = (l2.val+carry)/10;
            l2 = l2.next;
            node = node.next;
        }
        while(l1 != null){
            node.next = new ListNode((l1.val+carry)%10);
            carry = (l1.val+carry)/10;
            l1 = l1.next;
            node = node.next;
        }
        if(carry != 0)node.next = new ListNode(carry);
        return head.next;
    }
    public ListNode reverseList(ListNode head) {
        if(head == null)return head;
        ListNode prev = null;
        ListNode next = head.next;
        ListNode pres = head;
        while(next != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            next = next.next;
        }
        pres.next = prev;
        return pres;
    }
}
