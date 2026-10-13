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
        /*
        1. Middle nikal lo LL ka
        2. Right half ko reverse kar do
        3. Left half aur Right half ko alternate merge kar do (Compare nahi karna hai)
        */

        if (head == null || head.next == null) return;

        // Step 1: Find the middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // List ko mid se break karna zaroori hai cycle avoid karne ke liye
        ListNode head2 = slow.next;
        slow.next = null; 
        ListNode head1 = head;

        // Step 2: Reverse the right half
        head2 = reverseList(head2);

        // Step 3: Alternate merge the two halves
        while (head2 != null) {
            // Next nodes ko save karo
            ListNode next1 = head1.next;
            ListNode next2 = head2.next;
            
            // Pointers ko cross-link karo
            head1.next = head2;
            head2.next = next1;
            
            // Pointers aage badhao
            head1 = next1;
            head2 = next2;
        }
    }
    
    // Helper function reverse karne ke liye (Yeh tumne sahi likha tha)
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}