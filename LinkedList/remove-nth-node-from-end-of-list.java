class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null&&n==1){
            return null;
        }
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        if(size==n){
           head=head.next;
           return head;
        }
        int count=size-n-1;
        int var=0;
        while(var<count){
            temp=temp.next;
            var++;
        }
        ListNode deleted=temp.next;
        temp.next=deleted.next;
        return head;
    }
}
