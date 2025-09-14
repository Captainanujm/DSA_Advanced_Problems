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
    public ListNode rev(ListNode prev,ListNode curr,ListNode next){
        if(next==null){
            curr.next=prev;
            return curr;
        }
        curr.next=prev;
       return rev(curr,next,next.next);
    }
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode prev=rev(null,head,head.next);
       return prev;
    }
}
