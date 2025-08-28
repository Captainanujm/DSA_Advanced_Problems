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
    ArrayList<Integer>inod=new ArrayList<>();
    public void Inorder(TreeNode root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        inod.add(root.val);
        Inorder(root.right);
    }
    HashMap<Integer,Integer>map=new HashMap<>();
    public void getValue(ArrayList<Integer> list){
        boolean meet=false;
        int min=Integer.MAX_VALUE;
        int ele=list.get(0);
        for(int i=0;i<list.size();i++){
              if(meet!=true&&i!=list.size()-1&&list.get(i)>list.get(i+1)){
                meet=true;
                ele=list.get(i);
                min=ele;
              }
              if(meet==true&&min>list.get(i)){
                min=list.get(i);
              }
        }
      map.put(ele,min);
      map.put(min,ele);


    }
public void changeNode(TreeNode root){
       if(root==null){
            return;
        }
        changeNode(root.left);
      if(map.containsKey(root.val)){
        root.val=map.get(root.val);
      }
        changeNode(root.right);
}
    public void recoverTree(TreeNode root) {
        Inorder(root);
        getValue(inod);
        changeNode(root);

    }
}
