
class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
        Node temp=head;
        Node prev=null;
        int c=Integer.MIN_VALUE;
        while(head!=null)
        {
                if(head.data==c)
                {
                    prev.next=head.next;
                    head=head.next;
                }
                else
                {
                    c=head.data;
                    prev=head;
                    head=head.next;
                }
        }
        
        return temp;
	    
    }
}

