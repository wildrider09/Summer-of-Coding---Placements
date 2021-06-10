class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Node head1=null,t1=null;
        Node t=head;
        
        while(t!=null)
        {
            if(head1==null)
            {
                head1=new Node(t.data);
                t1=head1;
            }
            else
            {
                t1.next=new Node(t.data);
                t1=t1.next;
            }
            
            t=t.next;
        }
        
        head1=reverseList(head1);
       
        while(head!=null)
        {
            if(head.data==head1.data)
            {
                head=head.next;
                head1=head1.next;
            }
            else
                return false;
        }
        return true;
    }  
    
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

