class Solution {
  public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
      
        return (Math.abs(ht(root.left) - ht(root.right)) < 2)
            && (isBalanced(root.left) && isBalanced(root.right));
    }
    
    private int ht(TreeNode node){
        
        if(node == null) return 0;
        
        return Math.max(ht(node.left), ht(node.right)) + 1;
    }
}
