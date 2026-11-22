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
        
        int len = 0;
        ListNode temp = head;
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        if (len < k) {
            return head;
        }

        // reverse first 'k' len group
        ListNode prev = null;
        ListNode curr = head;
        
        for (int i=1; i<=k; i++) {
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

        // solve the remaining list using recursion
        ListNode RecursionAnsHead = reverseKGroup(curr, k);

        // join both list
        head.next = RecursionAnsHead;

        // return modified head
        return prev;
    }
}