/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;
        while (a != null && b != null) {
            a = a.next;
            b = b.next;
        }

        // find extra len
        if (a == null) {
            // ya toh b wli list ki length bdi h 'a' ke ya fir equal h
            int bExtraLen = 0;
            while (b != null) {
                bExtraLen++;
                b = b.next;
            }
            while (bExtraLen-- > 0) {
                headB = headB.next;
            }
        }
        else {
            // b == null
            // a wli list lengthy h 'b' se ya fir equal h
            int aExtraLen = 0;
            while (a != null) {
                aExtraLen++;
                a = a.next;
            }
            while (aExtraLen-- > 0) {
                headA = headA.next;
            }
        }
        
        // ab mere pass haedA aur headB is tarike sei lge hue h ki unse 
        // start krte hue end tk jye toh dono list mei same no. of nodes milegi

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        // agr khi pr bhi common node nhi mili toh return null
        return null;
    }
}