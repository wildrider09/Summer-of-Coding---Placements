class Solution {
    
    public TreeNode deleteNode(TreeNode root, int key) {
        
        root=delete(root,key);
        return root;
    }
    
    TreeNode delete(TreeNode root,int key)
    {
        if(root==null)
            return null;
        
        if(root.val==key)
        {
            if(root.left==null && root.right==null)
                root=null;
            else if(root.left==null) 
                root=root.right;
            else if(root.right==null)
                root=root.left;
            else
            {
                int x=find(root.left);
                root.val=x; 
                root.left=delete(root.left,x);
            }
        }
        else if(root.val>key)
            root.left=delete(root.left,key);
        
        else
            root.right=delete(root.right,key);
        
        return root;
    }
    
    int find(TreeNode root)
    {
        while(root.right!=null)
            root=root.right;
        
        int t=root.val;
        return t;
    }
}
