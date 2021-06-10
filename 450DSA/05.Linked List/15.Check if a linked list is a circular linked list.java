class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here	
	    if(head==null && head.next==null)
	        return false;
	    
	    head.data=Integer.MIN_VALUE;
	    head=head.next;
	    while(head!=null)
	    {
	        if(head.data==Integer.MIN_VALUE)
	            return true;
	        head=head.next;
	    }
	    return false;
    }
}
