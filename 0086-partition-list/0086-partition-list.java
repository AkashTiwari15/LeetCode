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
        ListNode dummyless = new ListNode(0);
        ListNode dummymore = new ListNode(0);
        ListNode tl = dummyless;
        ListNode tg = dummymore;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                tl.next = temp;
                tl = tl.next;
            }else{
                 tg.next = temp;
                 tg = tg.next;
            }
            temp = temp.next;
            
        }
        tl.next = dummymore.next;
        tg.next = null;
        return dummyless.next;
    }
}