public class Codec {
    String coded = "";

    // Helper for serialize
    public void serCode(TreeNode root){
        if(root == null){
            coded += "$,";
            return;
        }
        coded += root.val + ",";
        serCode(root.left);
        serCode(root.right);
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        coded = "";
        serCode(root);
        return coded;
    }

    // Helper for deserialize
    public TreeNode buildTree(Queue<String> q) {
        String val = q.poll();
        if(val == null) return null;
        if(val.equals("$")) return null;

        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = buildTree(q);
        node.right = buildTree(q);
        return node;
    }

    // Decodes string to tree
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        Queue<String> q = new LinkedList<>();
        for(String s : arr){
            if(s.length() > 0) q.add(s);
        }
        return buildTree(q);
    }
}
