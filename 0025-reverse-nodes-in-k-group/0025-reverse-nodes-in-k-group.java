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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) return head;

        // calculate length
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // dummy node setup
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        

        ListNode pre = dummy;
        ListNode curr;
        ListNode nex;

        // reverse in k-groups
        while (len >= k) {
            curr = pre.next;
            nex = curr.next;

            for (int i=1; i<k; i++) {
                curr.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = curr.next;
            }
            pre = curr;
            len -= k;
        }
        return dummy.next;
    }
}