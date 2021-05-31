class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node t=null;
        
        while(head1!=null && head2!=null)
        {
            if(head1.data==head2.data)
            {
                t=addn(t,head1.data);
                head1=head1.next;
                head2=head2.next;
            }
            else if(head1.data>head2.data)
                head2=head2.next;
            else
                head1=head1.next;
        }
        return t;
    }
     public static Node addn(Node t,int data)
    {
        if(t==null)
        {
            t=new Node(data);
            return t;
        }
        Node t1=t;
        Node t2=new Node(data);
        while(t1.next!=null)
        {
            t1=t1.next;   
        }
        
        t1.next=t2;
        return t;
    }
}
