class Solution
{
    static class Node
    {
    	int data;
    	Node left, right;
    };
    
    static Node temp = null;
    static int k;
    
    static Node head=newNode(0);
    static Node t=head;
    static Node kthAncestorDFS(Node root, int node )
    {
        if(root==null)
            return null;
        
        if(!solve(root,node))       return newNode(-1);

        head=head.right;

        while(--k>=0 && head!=null)
            head=head.right;

        if(head==null)             return newNode(-1);
        
        else                       return head;
    	
    }
    
    static boolean solve(Node root,int x)
    {
        if(root==null)
            return false;
        if(root.data==x)
        {
            t.right=newNode(root.data);
            t=t.right;
            return true;
        }
        
        boolean l=solve(root.left,x);
        boolean r=solve(root.right,x);
        if(l || r)
        {
            t.right=newNode(root.data);
            t=t.right;
            return true;
        }
        
        return false;
    }
    
    static Node newNode(int data)
    {
    	Node temp = new Node();
    	temp.data = data;
    	temp.left = temp.right = null;
    	return temp;
    }
    
    
    public static void main(String args[])
    {
    	Node root = newNode(1);
    	root.left = newNode(2);
    	root.right = newNode(3);
    	root.left.left = newNode(4);
    	root.left.right = newNode(5);
    
    	k = 2;
    	int node = 5;
    
    	Node parent = kthAncestorDFS(root,node);
    	
    	if (parent != null)
    		System.out.println(parent.data);
    }
}




static Node kthAncestorDFS(Node root, int node )
{ 
    // Base case
    if (root == null)
        return null;
        
   
    Node t1=kthAncestorDFS(root.left,node);
    
    Node t2=kthAncestorDFS(root.right,node);
       
    if(root.data==node||t1!=null||t2!=null)
    {
        if(k>0) k--;
        else if(k==0) return temp1=root;
        return root;
    }
    
    return null;
} 
// Driver code
public static void main(String args[])
{
   
    Node root = newNode(1);
    root.left = newNode(2);
    root.right = newNode(3);
    root.left.left = newNode(4);
    root.left.right = newNode(5);
  
    k = 2;
    int node = 5;
  

    Node parent = kthAncestorDFS(root,node);
      
    if (temp1 != null)
        System.out.println(temp1.data);
    else
        System.out.println("-1");
}

