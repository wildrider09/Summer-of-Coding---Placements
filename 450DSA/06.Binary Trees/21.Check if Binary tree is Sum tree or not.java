class Solution
{
    boolean t=true;
	boolean isSumTree(Node root)
	{
         if(root==null)
            return false;
         solve(root);    
         return t;
	    
	}
    
    
    public int solve(Node root){
         //add code here.
         
         if(root==null)
            return 0;
          if(root.left==null && root.right==null)
              return root.data;
              
          int l=solve(root.left);
          int r=solve(root.right);
    
          if(root.data==(l+r))
                return root.data+root.data;
          else
          {
             t=false;
            return -999;
           }
    }
}

