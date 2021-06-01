class Solution 
{
    //Function to return the diameter of a Binary Tree.
    int result=Integer.MIN_VALUE;
    //Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here
        
        solve(root);
        return result;
    }
    
    int solve(Node root)
    {
        if(root==null )
            return 0;
        
        int l=solve(root.left);
        int r=solve(root.right);
            
        int ht=1+Math.max(l,r);
        int ans=Math.max(ht,1+l+r);
        result=Math.max(result,ans);
        
        
        return ht;
    }
}

