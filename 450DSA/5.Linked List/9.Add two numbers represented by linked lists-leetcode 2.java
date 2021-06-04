class Solution{
    //Function to add two numbers represented by linked list.
   static Node addTwoLists(Node first, Node second){
       
       first=reverse(first);
       second=reverse(second);
       
       return sum(first,second);
       
    }
    
    static Node reverse(Node first){
       
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
    
    static Node sum(Node first,Node second){
        
        Node t=null,tt1=null;
        int carry=0,t1=0,t2=0,addn=0;
        
        while(first!=null || second!=null || carry==1)
        {
            t1=0;t2=0;addn=0;
            
            if(first!=null && second!=null)
            {
                t1=first.data;  first=first.next;
                t2=second.data; second=second.next;
            }
            else if(first==null && second!=null)
            {  t2=second.data; second=second.next; }
            
            else if(first!=null && second==null)
            {   t1=first.data;  first=first.next; }
            
            addn=t1+t2+carry;
            
            if(addn>9)   carry=1;
            else         carry=0;
        
            addn=addn%10;
            
            if(t==null){
                t=new Node(addn);
                tt1=t;}
            else{
                tt1=new Node(addn);
                tt1.next=t;
                t=tt1;}  
        }
        return t;
    
    }
}
