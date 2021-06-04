class Gfg {
    Node rotateP (Node head, int p){
        //Write your code here
        if(head==null || head.next==null)
            return head;
            
        Node temp=head,root=head,prev=null;
        
        while(head!=null && p-->=1)
        {
            prev=head;
            head=head.next;
        }
        prev.next=null;
        
        if(head!=null)
        {
            root=head;
            head.prev=null;
            while(head.next!=null)
                head=head.next;
            head.next=temp;
        }
        return root;
        
    }
}
