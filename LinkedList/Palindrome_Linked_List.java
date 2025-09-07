/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node rev_copy(Node head){
        Node curr=head;
        Node temp=null;
        while(curr!=null){
            Node t=new Node(curr.data);
            t.next=temp;
            temp=t;
            curr=curr.next;
        }
        return temp; //as head
    }
    public boolean isPalindrome(Node head) {
        // code here
        boolean pal=true;
        Node rev_head=rev_copy(head);
        Node tempo=head;
        while(rev_head!=null&&tempo!=null){
            if(rev_head.data!=tempo.data){
                pal=false;
                break;
            }
            rev_head=rev_head.next;
            tempo=tempo.next;
        }
        return pal;
    }
}
