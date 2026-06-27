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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return MergeSort(left,right);
    }
    ListNode MergeSort(ListNode left,ListNode right){
        ListNode node = new ListNode();
        ListNode head = node;
        while(left != null && right != null){
            if(left.val <= right.val){
                node.next = left;
                left = left.next;
            }
            else{
                node.next = right;
                right = right.next;
            }
        node = node.next;
        }
        node.next = (left == null)?right:left;
        return head.next;
    }
    ListNode getMid(ListNode head){
        ListNode midP = null;
       while(head != null && head.next != null){
        midP = (midP == null) ? head : midP.next;
        head = head.next.next;
       }
       ListNode mid = midP.next;
       midP.next = null;
       return mid;
    }
}
