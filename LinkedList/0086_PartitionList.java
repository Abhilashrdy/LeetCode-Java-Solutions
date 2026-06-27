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
    public ListNode partition(ListNode head, int x) {
        ListNode node = new ListNode();
        ListNode h = node;
        ListNode t = head;
        while(t != null){
            if(t.val < x){
                node.next = new ListNode(t.val);
                node = node.next;
            }
            t = t.next;
        }
        while(head != null){
            if(head.val >= x){
                node.next = new ListNode(head.val);
                node =node.next;
            }
            head = head.next;
        }
        // Display(h);
        return h.next;
    }
    private void Display(ListNode head){
        while(head != null){
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println("END");
    }
}
