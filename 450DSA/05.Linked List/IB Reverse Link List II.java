public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        
        if(B==C || A==null || A.next==null)
            return A;
        ListNode head=A;
        ListNode prev=null;
        int count=1;
        while(count!=B)
        {
            count+=1;
            prev=A;
            A=A.next;
        }
        ListNode nex=null,pren=null,cur=A;
        while(cur!=null && count<=C)
        {
            count+=1;
            nex=cur.next;
            cur.next=pren;
            pren=cur;
            cur=nex;
        }
        if(prev!=null)
        { prev.next=pren;}
        else
            head=pren;
        A.next=cur;
        return head;
    }
}

