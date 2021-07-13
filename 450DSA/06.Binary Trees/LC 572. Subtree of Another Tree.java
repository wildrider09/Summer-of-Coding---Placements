class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(root==null && subRoot==null){
            return true;
        }else if(root==null){
            return false;
        }else{
            if(equal(root, subRoot)){
                return true;
            }else{
                return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
            }
        }
    }
    
    private boolean equal(TreeNode root, TreeNode subRoot){
        if(root!=null && subRoot!=null){
            if(root.val != subRoot.val){
                return false;
            }else{
                return equal(root.left, subRoot.left) && equal(root.right, subRoot.right);
            }
        }else if(root==null && subRoot!=null || root!=null && subRoot==null){
            return false;
        }else{
            return true;
        }
    }
}
