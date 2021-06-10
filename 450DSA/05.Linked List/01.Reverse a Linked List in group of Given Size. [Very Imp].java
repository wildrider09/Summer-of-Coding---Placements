class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node prev=null,curr=node,q=null;
        int count=k;
        while(curr!=null && k -- >0 )
        {
            q=curr.next;
            curr.next=prev;
            prev=curr;
            curr=q;
        }
        if(curr!=null)
            node.next=reverse(curr,count);
        
        return prev;
    }
    
}


