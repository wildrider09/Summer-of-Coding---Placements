class Solution
{
    Node mergeKList(Node[]arr,int K)
    {
        PriorityQueue<Node> q=new PriorityQueue<>(1,(a,b)-> a.data-b.data);
        
        Node head=new Node(0);
        Node temp=head;
        
        int i=0;
        
        while(i < K)
            q.add(arr[i++]);
        
        while(!q.isEmpty())
        {
            Node t=q.remove();
            temp.next=new Node(t.data);
            temp=temp.next;
            
            if(t.next!=null)
                q.add(t.next);
        }
        
        return head.next;
    }
}
