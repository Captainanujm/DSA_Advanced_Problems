/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/


// Intuition-:
//1) Just store the Node as key and same copy of Node as value in hashmap and repeatedly check the original node and to whom it is pointing from original linked list.
// 2) Just make the link of the cloned nodes by getting the value of original nodes by seeing in hashmap.

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node>map=new HashMap<>();
        Node temp=head;
        //to store the copy of nodes
        while(temp!=null){
            map.put(temp,new Node(temp.val));
            temp=temp.next;
        }
        //to traverse the original list
        temp=head;
        //loop to make link of copied nodes
        while(temp!=null){
            //get the value of original node and store in the tempNode
            Node tempNode=map.get(temp);
            if(temp.next!=null){
                // check the link of original node
                // get the link and check the linked value in hashmap and 
                // store in the next of copied node
                tempNode.next=map.get(temp.next);
            }else{
                tempNode.next=null;
            }
            // to make the link of random pointer
            if(temp.random!=null){
                tempNode.random=map.get(temp.random);
            }else{
                tempNode.random=null;
            }
            temp=temp.next;
        }
        //get the head of copied list
        return map.get(head);
    }
}
