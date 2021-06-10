class Solution {
    public ListNode sortList(ListNode head) {

        return partition(head);
    }
    
    public ListNode partition(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        ListNode temp=findmid(head);
        ListNode start=temp.next;
        temp.next=null;
    
        head=    partition(head);
        start=   partition(start);
        return mergeTwo(head,start);
    }
    
    public ListNode mergeTwo(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        
        if (l1.val < l2.val) {
            l1.next = mergeTwo(l1.next, l2);
            return l1;
        } 
        else {
            l2.next = mergeTwo(l1, l2.next);
            return l2;
        }
    }
    public ListNode findmid(ListNode head)
    {
        ListNode slow=head,fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }   
}
