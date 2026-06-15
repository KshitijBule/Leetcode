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
    public ListNode deleteMiddle(ListNode head) {
        ListNode front = head;
        ListNode back = head;
        ListNode temp = null;

        if(head.next == null){
            return head.next;
        }

        for(int i=0;i<1;i++){
             front = front.next.next;
            back = back.next;
            temp = head;
        }

        while(front!=null && front.next!=null){
            front = front.next.next;
            back = back.next;
            temp = temp.next;

        }
        temp.next = temp.next.next;

        return head;
    }
}