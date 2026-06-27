/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int s1 = getSize(headA);
        int s2 = getSize(headB);
        if(s1 > s2)return intersectionNode(headA,headB,s1,s2);
        return intersectionNode(headB,headA,s2,s1);
    }
    int getSize(ListNode head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }
    ListNode intersectionNode(ListNode headA,ListNode headB,int s1,int s2){
        while(s1 > s2){headA = headA.next;s1--;}
        while( headA != null && headA != headB){
            headA= headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
