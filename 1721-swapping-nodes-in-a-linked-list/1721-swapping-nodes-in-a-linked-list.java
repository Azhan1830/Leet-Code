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
        ListNode first = head;
        for (int i=1; i<=(k-1); i++) {
            first = first.next;
        }

        // first -> kth node from beginning

        ListNode temp = first.next;
        ListNode second = head;
        // is window ko move kiya one step at a time
        while (temp != null) {
            temp = temp.next;
            second = second.next;
        }

        // ab temp null pr aa chuka h
        // iska mtlb second node -> kth node from end h
        // ab swap values
        int tempVal = first.val;
        first.val = second.val;
        second.val = tempVal;

        // return modified head
        return head;
    }
}