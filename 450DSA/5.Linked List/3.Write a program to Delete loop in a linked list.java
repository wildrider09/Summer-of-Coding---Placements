class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        Node prev=null;
        
        while(head!=null)
        {
            if(head.data!=Integer.MIN_VALUE)
            {
                head.data=Integer.MIN_VALUE;
                prev=head;
                head=head.next;
                continue;
            }
            else
                prev.next=null;
            return;    
        }
        
    }
}

class Solution
{
    public static void removeLoop(Node head){
        
        Node fast=head,slow=head,prev=null;
        
        while(fast!=null && fast.next!=null)
        {
            prev=fast.next;
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) break;
        }
        if(fast!=slow) return;
        
        
        slow=head;
        
        while(slow!=fast)  //this may not run becoz there maybe case: fast==head==slow
        {                  //so we have already made prev pointing before to fast
            slow=slow.next;
            prev=fast;
            fast=fast.next;
            
        }
        prev.next=null;
        return;    
        
    }
}
