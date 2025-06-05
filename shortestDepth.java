public class shortestDepth {
    public int minDepth(TreeNode root) {
        return dfs(root,0);
    }
    public int dfs(TreeNode node,int depth){
        depth++;
        if(node.left == null && node.right==null){
            return depth;
        }
        int d1 = dfs(node.left,depth);
        int d2 = dfs(node.right,depth);
        d1 = Math.min(d1,d2);
        return d1;
    }
}
