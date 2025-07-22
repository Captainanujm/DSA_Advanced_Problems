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
    public List<Integer> inorderTraversal(TreeNode root) {
          ArrayList<Integer>list=new ArrayList<>();
        if(root==null){
            return list;
        }
        TreeNode temp=root;
        Stack<TreeNode>st=new Stack<>();
      
        while(!st.isEmpty()||temp!=null){
            while(temp.left!=null){
                st.push(temp);
                temp=temp.left;
            }
            list.add(temp.val);
            if(temp.right!=null){
                temp=temp.right;
            }else{
                 TreeNode t=null;
                if(!st.isEmpty()){
                    t=st.pop();
                      list.add(t.val);
                }
               while(!st.isEmpty()&&t.right==null){
                     t=st.pop();
                     list.add(t.val);

                }
                if(t==null){
                    break;
                }else{
                    temp=t.right;
                }
                
            }

        }
        return list;
    }
}
