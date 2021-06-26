public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        // code here.
        return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    
    boolean check(Node root,int low,int high)
    {
        
        if(root==null)
            return true;
            
        if( low>=root.data || high<=root.data)
            return false;

        return check(root.left,low,root.data) && check(root.right,root.data,high);    
    }
}
