class Solution {
    
    int result=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        solve(root);
        return result;
    }
    
    int solve(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int l=solve(root.left);
        int r=solve(root.right);
        
        int temp= Math.max(root.val,root.val+Math.max(l,r));
        int ans=Math.max(temp,root.val+l+r);
        
        result=Math.max(ans,result);
        
        return temp;
        
        
    }
}
