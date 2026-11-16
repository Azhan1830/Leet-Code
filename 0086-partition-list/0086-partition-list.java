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
    public ListNode partition(ListNode head, int x) {
        ListNode lesserHead = new ListNode(-1);
        ListNode lesserTail = lesserHead;

        ListNode greaterHead = new ListNode(-1);
        ListNode greaterTail = greaterHead;

        ListNode temp = head;
        
        while (temp != null) {
            if (temp.val < x) {
                // separate this node and append to lesser wli LL
                // also before doing this, make sure temp points to head
                // of remaining LL
                ListNode NodeToInsert = temp;
                temp = temp.next;
                NodeToInsert.next = null;
                // insert at tail -> lesser wli LL mei
                lesserTail.next = NodeToInsert;
                lesserTail = NodeToInsert;
            }
            else {
                ListNode NodeToInsert = temp;
                temp = temp.next;
                NodeToInsert.next = null; 
                // insert at tail -> greater wli LL mei
                greaterTail.next = NodeToInsert;
                greaterTail = NodeToInsert;
            }
        }
        // yha pr hmri dono sub LL ready h
        // join them
        // also remove dummy nodes
        lesserTail.next = greaterHead.next;
        greaterTail.next = null;
        // remove starting wli dummy node
        lesserHead = lesserHead.next;

        // return answer
        return lesserHead;
    }
}