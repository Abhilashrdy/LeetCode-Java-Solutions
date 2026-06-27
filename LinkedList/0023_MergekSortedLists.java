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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)return null;
        if(lists.length == 1)return lists[0];
        int i = getMinOfAll(lists);
        if(i == -1)return null;
        ListNode node = new ListNode(lists[i].val);
        lists[i] = lists[i].next;
        node.next = mergeKLists(lists);
        return node;
    }
    private int getMinOfAll(ListNode[] lists){
        int min = Integer.MAX_VALUE,minI = -1;
        for(int i = 0 ; i < lists.length ; i++){
            if(lists[i] != null && min > lists[i].val){
                min = lists[i].val;
                minI = i;
            }
        }
        return minI;
    }
}
