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



class GfG
{
    Node flatten(Node root)
    {
        if(root==null || root.next==null)
            return root;
        
        Node temp=root;
        
        while(temp!=null && root.next!=null)
         {
            temp=merge(temp,root.next);
            root=root.next; 
         }
        
        return temp;
    }
    
     Node merge(Node root1,Node root2)
    {
        if(root1==null) return root2;
        if(root2==null) return root1;
        
        if(root1.data>root2.data)
        {
            root2.bottom=merge(root1,root2.bottom);
            return root2;
               
        }
        else
        {
            root1.bottom=merge(root1.bottom,root2);
            return root1;
        }
        
    }
    
}
