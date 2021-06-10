class Solution
{
    public Node removeDuplicates(Node head) 
    {
        if(head ==null || head.next==null)
            return head;
        
        int arr[]=new int[100000];     
        Node prev=null,temp=head;
        while(temp!=null)
        {
            if(arr[temp.data]==0)
            {
                arr[temp.data]=1;
                prev=temp;
                temp=temp.next;
            }
            else
            {
                prev.next=temp.next;
                temp=temp.next;
            }
        }
        
        return head;
    }
}

