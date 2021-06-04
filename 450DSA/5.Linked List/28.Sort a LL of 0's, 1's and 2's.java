class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        Node x = null, temp = null;
     
        int cnt[] = new int[3] ;
        while(head!=null)
        {
            cnt[head.data]++ ;
            head=head.next;
        }
        
        for(int i = 0 ; i < 3 ; i++)
        {
            while(cnt[i]-- > 0)
            {
                if(x==null)
                {
                    x=new Node(i);
                    temp=x;
                }
                else
                {
                    temp.next= new Node(i) ;
                    temp = temp.next ;
                }
            }
        } 
        
        return x;
    }
}
