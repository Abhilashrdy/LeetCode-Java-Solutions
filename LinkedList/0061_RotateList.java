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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)return head;
        int size = getListNodeSize(head);
        k %= size;
        if(k == 0)return head;
        ListNode temp = head;
        for(int i = 0 ; i < size-k-1 ; i++){
            temp = temp.next;
        }
        ListNode t = temp.next;
        temp.next = null;
        ListNode h = t;
        while(t != null && t.next != null){
            t = t.next;
        }
        t.next = head;
        return h;
    }
    private int getListNodeSize(ListNode head){
        int size = 0;
        while(head != null){
            head = head.next;
            size++;
        }
        return size;
    }
}
