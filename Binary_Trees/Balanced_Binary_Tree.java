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
class Solution {
    boolean isCheck=true;
     public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int heightleft=height(root.left);
        int heightright=height(root.right);
        if(Math.abs(heightright-heightleft)>1){
            isCheck=false;
        }
        return Math.max(heightleft,heightright)+1;
    }
    public boolean isBalanced(TreeNode root) {
        height(root);
       return isCheck;
        
    }
}
