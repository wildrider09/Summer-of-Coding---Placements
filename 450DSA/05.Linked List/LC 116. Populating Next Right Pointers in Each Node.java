class Solution {
    public Node connect(Node root) {
        
        Queue<Node> queue= new LinkedList<Node>();
           
        if(root!=null)
            queue.add(root);
        
        while(!queue.isEmpty())
        {
            ArrayList<Node> list=new ArrayList<Node>();
            int count=queue.size();
            for(int i=0;i<count;i++)
            {
                Node t=queue.remove();
                list.add(t);
                if(t.left!=null)
                    queue.add(t.left);
                    
                if(t.right!=null)
                    queue.add(t.right);
            }
            Node t=list.remove(0);
            Node t1=t;
            while(!list.isEmpty())
            {
                t1=list.remove(0);
                t.next=t1;
                t=t1;
            }
            t1.right=null;
            
            
        }
        return root;
        
    }
}
