class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    { 
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Node> queue=new LinkedList<>();
        
        if(root==null)
            return list;
        
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
                
                if(i==0)
                    list.add(t.data);
            }    
        }
            
        
        return list;
    }
}
