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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        int index = 0;

        // find out the length
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        
        int BaseSize = (len / k);
        int ExtraNodes = (len % k);

        // main logic
        ListNode prev = null;
        ListNode curr = head;

        for (int part=0; part<k; part++) {
            // dimaag lgane wla point
            if (curr == null) {
                ans[part] = curr;
                continue;
            }
            
            // insert curr into array
            ans[part] = curr;
            
            // find width of the cuurent sublist
            int width = BaseSize + (ExtraNodes > 0 ? 1 : 0);
            // extranodes ko decrement krna h
            ExtraNodes--;

            for (int i=1; i<=width; i++) {
                prev = curr;
                curr = curr.next;

            }
            prev.next = null;
            // now we will move to next iteration
            prev = null;

        }
        return ans;
    }
}