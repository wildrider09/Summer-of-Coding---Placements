class Solution {
    public String tree2str(TreeNode root) {
        
        if(root==null)
            return "";
        if(root.left==null && root.right==null)
            return root.val+"";
        
        String s1=tree2str(root.left);
        String s2=tree2str(root.right);
        
        return root.val+"("+s1+")"+ (s2==""? "": "("+s2+")");
       
    } 
    
}
