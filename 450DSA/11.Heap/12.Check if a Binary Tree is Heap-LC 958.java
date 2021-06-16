class Solution
{
	boolean isHeap(Node tree)
	{
	    return check(tree)&&complete(tree);
	}
	
	boolean check(Node root)
	{
	    
        if(root==null || (root.left==null && root.right==null))
            return true;
    
        if(root.left!=null && root.data < root.left.data)
        {
            return false;
        }
        
        if(root.right!=null && root.data < root.right.data)
        {
            return false;
        }
        
        return check(root.left) && check(root.right);
    }
    
     boolean complete(Node root) 
     {
        if(root==null)
            return true;
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int flag=0;
        
        while(!q.isEmpty())
        {
            int c=q.size();
            for(int i=0;i<c;i++)
            {
                Node temp=q.remove();
                if(temp==null)
                    flag=1;
                else
                {
                    if(flag==1)
                        return false;
                    q.add(temp.left);
                    q.add(temp.right);
                }   
            }
        }
        
        return true;
    }
}
