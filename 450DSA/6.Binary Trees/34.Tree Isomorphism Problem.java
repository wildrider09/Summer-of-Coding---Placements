class Solution  
{ 
    // Return True if the given trees are isomotphic. Else return False.
    boolean isIsomorphic(Node root1, Node root2)  
    { 
         // code here.
        if(root1==null && root2==null) 
            return true;
        return solve(root1,root2);
    }
    boolean solve(Node root1,Node root2)
    {
        if(root1==null && root2==null)
            return true;
        if(root1==null || root2==null)
            return false;
        if(root1.data==root2.data)
            return (solve(root1.left,root2.right) && solve(root1.right,root2.left)) ||
                    (solve(root1.left,root2.left) && solve(root1.right,root2.right));
        else
            return false;
    }
    
}    
