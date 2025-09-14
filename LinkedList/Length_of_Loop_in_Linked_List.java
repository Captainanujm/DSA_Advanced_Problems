class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
         int count=0;
        boolean presentCyc=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                presentCyc=true;
                break;
            }
        }
        if(presentCyc==true){
            count=1;
            Node pre=head;
            while(pre!=slow){
                pre=pre.next;
                slow=slow.next;
            }
           
            Node temp=pre.next;
            while(temp!=pre){
                count++;
                temp=temp.next;
            }
        }
        return count;
    }
}
