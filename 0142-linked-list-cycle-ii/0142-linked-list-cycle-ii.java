/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // detect cycle
        ListNode slow = head;
        ListNode fast = head;
        boolean HasCycle = false;

        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }

            if (fast == slow) {
                HasCycle = true;
                break;
            }
        }
        
        if (HasCycle == false) {
            return null;
        }

        // detect starting node
        slow = head;
        while(fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }

        // ab loop ke bhar tbhi ayege jb (slow == fast) hoga
        ListNode startingNode = slow;
        return startingNode;
    }
}