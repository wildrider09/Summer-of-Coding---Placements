class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
        Node root=head;
        int count=0,k=0;
        while(root!=null)
        {
            root=root.next;
            count+=1;
        }
        k=count-n+1;
        count=1;
        root=head;
        
        if(k<1)
            return -1;
            
        while(count<k)
        {
            count++;
            root=root.next;
        }
        
        return root.data;
    }
}

