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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null)return head;
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;
        ListNode last = new ListNode();
        ListNode h = last;
        while(pres != null){
            ListNode newNodeP = pres;
            if(!getSize(pres,k))break;
        for(int i = 0 ;pres != null && i < k ; i++){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null)next = next.next;
        }
        last.next = prev;
        last = newNodeP;
        prev = null;
        }
        if(pres != null)last.next = pres;
        return h.next;
    }
    boolean getSize(ListNode head,int k){
        while(head != null && k > 0){
            // System.out.print(head.val+" -> ");
            head = head.next;
            --k;
        }
        // System.out.println("END");
        return k == 0;
    }
}
