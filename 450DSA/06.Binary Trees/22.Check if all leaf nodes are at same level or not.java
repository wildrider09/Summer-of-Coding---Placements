
class Solution
{
    int height=0;
    boolean check(Node root)
    {
	    if(root==null || (root.left==null && root.right==null))
	        return true;
	    
	    return solve(root,0);
    }
    
    boolean solve(Node root,int h)
    {
        if(root==null)
            return true;
        
        if(root.left==null && root.right==null)
        {
            if(height==0) height=h;
            
            if(height==h)
                return true;
            else
                return false;
        }
        
        return solve(root.left,h+1)&&solve(root.right,h+1);
    }
    
}


