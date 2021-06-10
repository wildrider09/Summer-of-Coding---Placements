
class Solution
{
    //Function to return the lowest common ancestor in a Binary Tree.
	Node lca(Node root, int n1,int n2)
	{
		// Your code here
		if(root==null)
		    return null;
		else if(root.data==n1 || root.data==n2)
		    return root;
		 
		Node l=lca(root.left,n1,n2);
		Node r=lca(root.right,n1,n2);
		
		if(l!=null && r!=null)
		    return root;
		else if(l!=null)
		    return l;
		else if(r!=null)
		    return r;
		else
		    return null;
		      
	}
}


