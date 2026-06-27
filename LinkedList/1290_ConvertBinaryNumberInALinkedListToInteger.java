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
    public int getDecimalValue(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;
        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null)next = next.next; 
        }
        int i = 0,ans = 0;
        while(prev != null){
            ans += (int)Math.pow(2,i)*prev.val;
            prev = prev.next;
            i++;
        }
        return ans;
    }
}
