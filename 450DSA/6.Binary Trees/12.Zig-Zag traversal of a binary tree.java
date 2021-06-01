class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    Queue<Node> queue=new LinkedList<>();
	    ArrayList<Integer> al=new ArrayList<>();
	    
	    if(root==null)
	        return al;
	    queue.add(root);
	    int flag=0;
	    while(!queue.isEmpty())
	    {
	        flag++;
	        ArrayList<Integer> arr=new ArrayList<>();
	        int count=queue.size();
	        
	        for(int i=0;i<count;i++)
	        {
	            Node t=queue.remove();
	            arr.add(t.data);
	            if(t.left!=null)
	                queue.add(t.left);
	            
	            if(t.right!=null)
	                queue.add(t.right);
	        }
	        if(flag%2==0)
	            Collections.reverse(arr);
	            
	        al.addAll(arr);
	        
	        
	    }
	    
	    return al;
	}
}
