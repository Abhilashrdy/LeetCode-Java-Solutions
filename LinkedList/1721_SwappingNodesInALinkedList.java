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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode node = head;
        int size = getListNodeSize(head);
        int[] arr = new int[size+1];
        int j =-1;
        while(node != null){
            arr[++j] = node.val;
            node = node.next;
        }
        int temp = arr[k-1];
        arr[k-1] = arr[j-k+1];
        arr[j-k+1] = temp;
        ListNode newNode = new ListNode();
        head = newNode;
        for(int i = 0; i <= j ; i++){
            newNode.next = new ListNode(arr[i]);
            newNode = newNode.next;
        }
        return head.next;
    }
    int getListNodeSize(ListNode head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }
}
