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
    public void reorderList(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode head2 = reverseList(mid);
        ListNode head1 = head;
        while(head1 != null && head2 != null){
            ListNode temp = head1.next;
            head1.next = head2;
            head1 = temp;
            temp = head2.next;
            head2.next = head1;
            head2 = temp;
        }
        if(head1 != null)head1.next = null;
        
    }
    private ListNode middleNode(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       while(fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
       }
       return slow;
    }
      private ListNode reverseList(ListNode head) {
        if(head == null)return head;
        ListNode prev = null;
         ListNode pres = head;
        ListNode next = pres.next;
        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
           if(next != null) next = next.next;
        }
        return prev;
    }
    //  private void Display(ListNode head){
    //     while(head != null){
    //         System.out.print(head.val+" -> ");
    //         head = head.next;
    //     }
    //     System.out.println("End");
    // }
}
