/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 //Using two stack approach.
 //Logic-:
 //->First visit the root node pop from stack1 and put into the stack 2.
 //->Then if its left is not null ,put into stack 1.
 //->If its right is not null ,put into stack 1.
 //-> Just put the condition while stack 1 does not empty.
 //-> Push all the elements from stack 2 to list and return it.

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer>list=new ArrayList<>();
        Stack<TreeNode>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        st1.push(root);
        if(root==null){
            return list;
        }
        while(!st1.isEmpty()){
            TreeNode current=st1.pop();
            st2.push(current.val);
            if(current.left!=null){
                st1.push(current.left);
            }
            if(current.right!=null){
                st1.push(current.right);
            }
        }
        while(!st2.isEmpty()){
            list.add(st2.pop());
        }
        return list;
       
    }
}
