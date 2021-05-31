class gfg
{
        // Function  to split a circular LinkedList
	    void splitList(circular_LinkedList list)
        {
           
           Node head=list.head;
           
           Node temp=head,temp1=null;
           int count =0;
           
           do{
               count++;
               temp=temp.next;
               
           } while(temp!=head);
           
           count=(int)(count+1)/2;
        
           while(count>1)
           {
              temp=temp.next; 
              count--;
           }
        
           list.head1=head;
           list.head2=temp.next;
           temp1=temp.next;
           temp.next=head;
           
           while(temp1.next!=head)
            temp1=temp1.next;
            
            temp1.next=list.head2;
	 }
}
