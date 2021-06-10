public static Node reverseDLL(Node  head)
{
    //Your code here
    Node previous=null,nextnode=null,curr=head;
    while(curr!=null)
    {
        nextnode  = curr.next;
        curr.next = previous;
        curr.prev = nextnode;
        previous  = curr;
        curr      = nextnode;
    }
    
    return previous;
}
