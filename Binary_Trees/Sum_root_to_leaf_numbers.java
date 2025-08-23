// Intuition-: just build the recursion call and traverse the tree till leaf node and check whether the node is leaf or not and add it in string
// Key point-: String are immutable in java , hence i passed it in argument because after one call the string for previous call will not get modified

class Solution {
    int sum=0;
    public void extract(TreeNode root,String str){
        if(root==null){
            return;
        }
        str=str+root.val;
        extract(root.left,str);
        extract(root.right,str);
      //condition to check leaf node
     if(root.left==null&&root.right==null){
            sum=sum+Integer.parseInt(str);
        }
    }
    public int sumNumbers(TreeNode root) {
        extract(root,"");
        return sum;
    }
}
