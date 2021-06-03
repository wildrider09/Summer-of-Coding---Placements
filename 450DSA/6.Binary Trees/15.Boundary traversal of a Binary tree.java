class Solution
{
    ArrayList<Integer> list=new ArrayList<>();
    ArrayList<Integer> list1=new ArrayList<>();
    

	ArrayList <Integer> printBoundary(Node root)
	{
	    
	    list.add(root.data);
	    
	    addLeftView(root.left);
	    addLeaves(root);
	    addRight(root.right);
	    Collections.reverse(list1);
	    
	    list.addAll(list1);
	    return list;
	    
	}
	
	void addLeftView(Node root)
	{
	
	    Queue<Node> queue=new LinkedList<>();
        
        if(root==null)
            return ;
        
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            int count=queue.size();
            for(int i=0;i<count;i++)
            {
                Node t=queue.remove();
                    
                if(t.left!=null)
                    queue.add(t.left);
                    
                if(t.right!=null)
                    queue.add(t.right);    
                
                if(i==0 && (t.left!=null || t.right!=null))
                    list.add(t.data);
            }    
        }
        
	}
	
	void addLeaves(Node root)
	{
	    if(root==null)
	        return;
	    if(root.left==null && root.right==null)
	        list.add(root.data);
	        
	    addLeaves(root.left);
	    addLeaves(root.right);
	}
	
	void addRight(Node root)
	{
	    Queue<Node> queue=new LinkedList<>();
        
        if(root==null)
            return ;
        
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            int count=queue.size();
            for(int i=0;i<count;i++)
            {
                Node t=queue.remove();
                    
                if(t.left!=null)
                    queue.add(t.left);
                    
                if(t.right!=null)
                    queue.add(t.right);    
                
                if(i==count-1 && (t.left!=null || t.right!=null))
                    list1.add(t.data);
            }    
        }
	}
	
}

