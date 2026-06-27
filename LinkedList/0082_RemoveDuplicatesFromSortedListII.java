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
    private int[] arr = new int[201];
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = deleteDuplicates1(head);
        ListNode h = node;
        while(h != null && arr[h.val+100] > 0)h = h.next;
        node = h;
        while(node != null){
            ListNode n = node.next;
            while(n != null && arr[n.val+100] > 0){
                n = n.next;
            }
            node.next = n;
            node = node.next;
        }
        return h;
    }
    ListNode deleteDuplicates1(ListNode head) {
        ListNode node = head;
        while(node != null){
            while(node.next != null && node.val == node.next.val){
                node.next = node.next.next;  
                arr[node.val+100]++;
            }
            node = node.next;
        }
        return head;
    }
}
