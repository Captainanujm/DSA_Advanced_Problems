// Intuition-: Used priority queue because priority queue sort the element in less time and it build min heap too.
// Remove the element till k-1 times and return the peek element of queue because i need k th element.
class Solution {
     PriorityQueue<Integer>queue=new PriorityQueue<>();
    public TreeNode entry_queue(TreeNode root){
        if(root==null){
            return root;
        }
        TreeNode left=entry_queue(root.left);
        TreeNode right=entry_queue(root.right);
        if(left!=null){
            queue.add(left.val);
        }
        if(right!=null){
            queue.add(right.val);
        }
return root;

    }
    public int kthSmallest(TreeNode root, int k) {
      TreeNode nodee= entry_queue(root);
      queue.add(nodee.val);
       for(int i=0;i<k-1;i++){
        queue.poll();
       }
       return queue.peek();

    }
}
