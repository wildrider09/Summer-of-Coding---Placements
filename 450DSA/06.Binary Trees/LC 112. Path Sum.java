class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
         if(root==null)
            return false;
        
        if(targetSum==root.val && root.left==null && root.right==null )
            return true;
        
        boolean l=hasPathSum(root.left,targetSum-root.val);            
        boolean r=hasPathSum(root.right,targetSum-root.val);
        if(r==true || l==true)
            return true;
        
        return false;
    
    }
}
