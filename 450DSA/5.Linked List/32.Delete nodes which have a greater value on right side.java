class Solution
{
    Node compute(Node head)
    {
        // your code here
        Node t=reverse(head);
        Node root=null,temp=null;
        int high=0;
        
        if(t!=null){
            root=new Node(t.data);
            high=t.data;
            t=t.next;
        }
        else
            return root;
        
        while(t!=null)
        {
            if(high<=t.data)
            {
                high=t.data;
                temp=new Node(high);
                temp.next=root;
                root=temp;
            }
            t=t.next;
        }
        
    return root;
    }
    
    Node reverse(Node first){
    
        Node cur=first, prev=null, next=null;
        while(cur!=null&&cur.next!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
    
        }
        cur.next=prev;
        first=cur;
        return first;
    }
}
