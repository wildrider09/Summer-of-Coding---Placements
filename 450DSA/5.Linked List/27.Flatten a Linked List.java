class GfG
{
    Node flatten(Node root)
    {
        Node x=null,temp=null;
        List<Integer> set=new ArrayList<Integer>();
        while(root!=null)
        {
            Node t=root;
            while(t!=null)
            {
                set.add(t.data);
                t=t.bottom;
            }
            root=root.next;
        }
        
        Collections.sort(set);
        
        if(!set.isEmpty())
        {
            x=new Node(set.remove(0));
            temp=x;
        }
        
        while(!set.isEmpty())
        {
            temp.bottom=new Node(set.remove(0));
            temp=temp.bottom;
        }
        
        return x;
        
        
        
    }
}
