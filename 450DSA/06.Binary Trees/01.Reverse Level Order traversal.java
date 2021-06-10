class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        
        Queue<Node> queue= new LinkedList<Node>();
        
        ArrayList<Integer> list=new ArrayList<Integer>();
            
        if(node!=null)
            queue.add(node);
        
        while(!queue.isEmpty())
        {
            ArrayList<Integer> list1=new ArrayList<Integer>();
        
            int count=queue.size();
            for(int i=0;i<count;i++)
            {
                Node t=queue.remove();
                list1.add(t.data);
                if(t.left!=null)
                    queue.add(t.left);
                    
                if(t.right!=null)
                    queue.add(t.right);
                
            }
            
            list.addAll(0,list1);
            
        }
        
        return list;
    }      
}
