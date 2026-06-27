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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = reverseList(head);
        if(n == 1){
            head = head.next;
            return reverseList(head);
        }
        ListNode temp = null;
        while(n > 1){
            temp = (temp == null)? head:temp.next;
            n--;
        }
        temp.next = temp.next.next;
        return reverseList(head);
    }
    ListNode reverseList(ListNode head) {
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
