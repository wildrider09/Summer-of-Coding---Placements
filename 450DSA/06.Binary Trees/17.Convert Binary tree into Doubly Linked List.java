class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node head=null;
    Node prev=null;
        
    Node bToDLL(Node root)
    {
	//  Your code here	
	solve(root);
	return head;
    }
    
    void solve(Node root)
    {
        if(root==null)
            return ;
        
	solve(root.left);
               
        if(prev==null)
            head=root;
        else
        {
            root.left=prev;
            prev.right=root;
        }
        prev=root;
 
        solve(root.right);
    }
}
