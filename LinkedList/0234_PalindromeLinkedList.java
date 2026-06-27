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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)return true;
        ListNode mid1 = getMid(head);
        ListNode mid2 = reverseList(mid1);
        while(head != null && mid2 != null){
            if(head.val != mid2.val)break;
            head = head.next;
            mid2 =mid2.next;
        }
        return head == null || mid2 == null;
    }
    private ListNode getMid(ListNode head){
        ListNode midPrev = null;
        while(head != null && head.next != null){
            midPrev = (midPrev == null)?head:midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    } 
    // private void Display(ListNode head){
    //     while(head != null){
    //         System.out.print(head.val+" -> ");
    //         head = head.next;
    //     }
    //     System.out.println("End");
    // }
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
}
