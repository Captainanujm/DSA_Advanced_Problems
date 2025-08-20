/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            Node temp=queue.poll();
            if(temp!=null){
                  if(temp.left!=null){
                queue.add(temp.left);
               }
              if(temp.right!=null){
               queue.add(temp.right);
              }
            }else{
                if(!queue.isEmpty()){
                    queue.add(null);
                }
            }
            if(temp!=null){
                 temp.next=queue.peek();
            }
        

        }
return root;
    }
}
