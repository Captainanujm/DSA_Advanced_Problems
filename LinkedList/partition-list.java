class Solution {
    public ListNode partition(ListNode head, int x) {
        Queue<ListNode> queue=new LinkedList<>();
        ListNode temp=head;
        ListNode prev=null;
        ListNode nextNode=null;
        ListNode newHead=null;
        while(temp!=null){
            nextNode=temp.next;
            if(temp.val>=x){
                temp.next=null;
                queue.add(temp);
                temp=nextNode;
            }else{
                if(prev==null){
                    newHead=temp;
                    prev=temp;
                    temp=nextNode;
                }else{
                    prev.next=temp;
                    prev=temp;
                    temp=nextNode;
                }
                prev.next=null;
            }
        }
        while(!queue.isEmpty()){
            if(prev!=null){
                prev.next=queue.poll();
                prev=prev.next;
            }else{
                //all nodes are greater then x 
                newHead=queue.poll();
                prev=newHead;
            }
        }
return newHead;
    }
}
