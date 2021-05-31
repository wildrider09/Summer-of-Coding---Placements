class Intersect
{
    int intersectPoint(Node head1, Node head2)
	{
	    if(head1==null || head2==null)
	        return -1;
	    
	    Node temp1=head1,temp2=head2;
	    int count1=0,count2=0;
	    
	    while(temp1!=null)
	    {
	      count1++;
	      temp1=temp1.next;
	    }
	    
	    while(temp2!=null)
	    {
	      count2++;
	      temp2=temp2.next;
	    }
	    
	    temp1=head1;    
	    temp2=head2;
	        
	    while( count1>count2)
	    {
	        temp1=temp1.next;
	        count1--;
	    }
	    
	    while( count1<count2)
	    {
	        temp2=temp2.next;
	        count2--;
	    }
	    
	    
	    while(temp1!=null && temp2!=null)
	    {
	    
	        if(temp1==temp2)
	        {
	            return temp1.data;
	        }
	        temp1=temp1.next;
	        temp2=temp2.next;
	    }
	    return-1;
	}
}

