class Solution {
    public ListNode oddEvenList(ListNode head) {
        
                
        ListNode et=null,et1=null;
        ListNode ot=null,ot1=null;
        int count=1;
        
        while(head!=null)
        {
            if(count%2!=0)
            {
                if(ot==null)
                {
                    ot=new ListNode(head.val);
                    ot1=ot;
                }
                else
                {
                    ot1.next=new ListNode(head.val);
                    ot1=ot1.next;
                }
            }
            else
            {
                 if(et==null)
                {
                    et=new ListNode(head.val);
                    et1=et;
                }
                else
                {
                    et1.next=new ListNode(head.val);
                    et1=et1.next;
                }
            }
            count++;
            head=head.next;
        }
        
       
        if(ot!=null)
        {
            if(et!=null) 
                ot1.next=et;
        }                
        else
            ot=et;
        
        return ot;
        
    }
        
    
}
