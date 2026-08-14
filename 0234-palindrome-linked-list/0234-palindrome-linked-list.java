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
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        // Find middle
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Separate first half and second half
        prev.next = null;

        // Reverse second half
        prev = null;
        ListNode temp = slow;
        ListNode nextp;

        while (temp != null) {
            nextp = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextp;
        }

        // Compare both halves
        ListNode t1 = head;
        ListNode t2 = prev;

        while (t1 != null && t2 != null) {
            if (t1.val != t2.val) {
                return false;
            }

            t1 = t1.next;
            t2 = t2.next;
        }

        return true;
    }
}