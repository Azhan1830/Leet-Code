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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null) return new int[]{-1,-1};

        ListNode prev = head;
        ListNode curr = head.next;
        int pos = 1;
        List<Integer> CriticalPoints = new ArrayList<>();

        while (curr != null && curr.next != null) {
            // compare for local maxima
            if (curr.val > prev.val && curr.val > curr.next.val) {
                CriticalPoints.add(pos);
            }
            // compare for local minima
            if (curr.val < prev.val && curr.val < curr.next.val) {
                CriticalPoints.add(pos);
            }
            curr = curr.next;
            prev = prev.next;
            pos = pos + 1;
        }

        // condition for array of length less than 2
        if (CriticalPoints.size() < 2) return new int[]{-1,-1};

        // now our arraylist for i critical points is ready
        int minDist = Integer.MAX_VALUE;

        for (int i=1; i<CriticalPoints.size(); i++) {
            minDist = Math.min(minDist, CriticalPoints.get(i) - CriticalPoints.get(i-1));
        }

        int maxDist = CriticalPoints.get(CriticalPoints.size()-1) - CriticalPoints.get(0);

        return new int[]{minDist, maxDist};
    }
}