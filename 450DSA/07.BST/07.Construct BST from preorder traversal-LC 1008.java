class Solution {
    
    static int k;
    public TreeNode bstFromPreorder(int[] preorder) {
        
        if(preorder.length==0)
            return null;
        
        k=0;
        TreeNode root=new TreeNode(preorder[k++]);
        
        if(preorder.length==1)
            return root;
        
        build(root,preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
        return root;

    }
    
    void build(TreeNode root,int preorder[],int min,int max)
    {
        if(k<preorder.length && preorder[k]>min && preorder[k]<root.val)
        {
                root.left=new TreeNode(preorder[k++]);
                build(root.left,preorder,min,root.val);
        }
        
        if(k<preorder.length && preorder[k]>root.val && preorder[k]<max)
        {
                root.right=new TreeNode(preorder[k++]);
                build(root.right,preorder,root.val,max);
        }
        
    }
}
