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
    public ListNode oddEvenList(ListNode head) {
        ListNode evenNode = new ListNode(0);
        ListNode oddNode = new ListNode(0);
        ListNode en = evenNode;
        ListNode on = oddNode;
        ListNode temp = head;
        int pos = 1;
        while(temp!=null){
        if(pos%2!=0){
            on.next = temp;
            on = on.next;
        }else{
            en.next = temp;
            en = en.next;
        }
        temp = temp.next;
        pos++;
        }
        on.next = evenNode.next;
        en.next = null;
        return oddNode.next;
    }
}