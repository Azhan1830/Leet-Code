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
        /*
        1. Ek pointer left lo aur usko k-1 steps aage badha do taaki wo start se kth node par khada ho jaye.

        2. Ab ek right pointer lo jo head par ho, aur ek curr pointer lo jo current left ki position par ho.

        3. Jab tak curr.next != null nahi ho jata, tab tak curr aur right dono ko ek-ek step aage badhao.

        4. Jab curr list ke end par pahuchega, tumhara right pointer automatically end se kth node par khada hoga (kyunki dono ke beech ka gap exactly k maintain hua hai).

        5. Dono ki values swap karo aur head return kar do. Ek hi loop mein saara kaam ho gaya!
        */

        ListNode left = head;
        for (int i=1; i<k; i++) {
            left = left.next;
        }

        ListNode curr = left;
        ListNode right = head;

        while (curr.next != null) {
            curr = curr.next;
            right = right.next;
        }

        int temp = left.val;
        left.val = right.val;
        right.val = temp;

        return head;
    }
}