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
    public int getSize(ListNode l1){
        int size=0;
        while(l1!=null){
            size++;
            l1=l1.next;
            
        }
        return size;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
        LinkedList<Integer>list=new LinkedList<>();
        int mod=0;
        while(l1!=null&&l2!=null){
            int sum=l1.val+l2.val;
            
             list.add((sum+mod)%10);
            mod=(sum+mod)/10;
            l1=l1.next;
            l2=l2.next;
           
        }
        while(l1!=null){
            list.add((l1.val+mod)%10);
            mod=(l1.val+mod)/10;
            l1=l1.next;
        }
        while(l2!=null){
            list.add((l2.val+mod)%10);
            mod=(l2.val+mod)/10;
            l2=l2.next;
        }
        if(mod>0){
            list.add(mod);
        }
       ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int val : list) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }
}
