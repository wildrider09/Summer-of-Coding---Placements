class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        //type of cases : 456, 4599,999 
        
        Node temp=head;          //last number of data
        Node last=null;          //last number which is not 9
        
        while(temp.next!=null)
        {
            if(temp.data!=9)
                last=temp;
                
            temp=temp.next;
        }
        
        if(temp.data!=9)      //case of 456
        {
            temp.data+=1;
            return head;
        }
        
        else
        {
            if(last!=null)        //case of 4599
            {
                last.data+=1;        //now number is 4699
                last=last.next;    
                while(last!=null)     //doing number as 4600
                {
                    last.data=0;
                    last=last.next;
                }
            
                return head;
            }
            
            else                     // case of 999
            {
                temp=head;
                while(temp!=null)
                {
                    temp.data=0;     //doing 000
                    temp=temp.next;
                }
        
                Node t1=new Node(1);  // add in front 1-> 1000
                t1.next=head;
                return t1;
        
            }
        }
    }
}

