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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        int pos = len - n + 1;

        if (pos == 1) {
            temp = head;
            head = head.next;
            return head;
        }

        temp = head;
        for (int i=1; i<pos-1; i++) {
            temp = temp.next;
        }
        ListNode delete = temp.next;
        temp.next = delete.next;
        return head;
    }
}