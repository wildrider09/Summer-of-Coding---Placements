class Solution {
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head == null || head.next == null || k<=0)
			return head;
        
        ListNode temp=head;	
        int count=1;
		while(temp.next!=null)
        {
            count++;
            temp=temp.next;
        }
        temp.next=head;
        k=k%count;
        
        temp=head;
        
        int skipLength = count - k;
        for(int i = 1; i < skipLength; i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        
        return head;
    }
}
