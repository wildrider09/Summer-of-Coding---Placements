
class BST
{   
    //Function to find the lowest common ancestor in a BST. \
   	Node LCA(Node root, int n1, int n2)
	{
        // code here.
        return find(root,n1,n2);

    }
    
    Node find(Node root,int n1,int n2)
    {
        if(root==null)
            return null;
        
        if(root.data==n1 || root.data==n2)
            return root;
        
        Node l=find(root.left,n1,n2);
        Node r=find(root.right,n1,n2);
        
        if(l!=null && r!=null)
            return root;
        else if(l!=null)
		    return l;
		else if(r!=null)
		    return r;
        return null;
    }
    
}
