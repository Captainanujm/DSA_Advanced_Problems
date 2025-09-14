class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode head1=head;
        ListNode head2=head1.next;
          ListNode temp1=head;
        ListNode temp2=head1.next;
        while(temp2!=null&&temp2.next!=null){
            temp1.next=temp1.next.next;
            temp2.next=temp2.next.next;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        temp1.next=head2;
        return head;
        
        
    }
}
