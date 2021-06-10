class Solution
{
    Node reverseList(Node head)
    {
        // code here
        Node prev=null,next=null;
        while(head!=null)
        {
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
            
        }
        head=prev;
        
        return head;
    }
   
}


class Solution
{
    Node reverseList(Node head)
    {
        // code here
        if(head==null||head.next==null)   return head;
        
        return reverse(null,head);
    }
    
    Node reverse(Node prev,Node curr)
    {
        if(curr==null)
            return prev;
            
        Node nex=curr.next;
        curr.next=prev;
        
        return reverse(curr,nex);
        
        
    }
   
}

