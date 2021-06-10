class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        
        while(head!=null)
        {
            if(head.data==Integer.MIN_VALUE)
                return true;
            else
                head.data=Integer.MIN_VALUE;
            head=head.next;
        }
        return false;
    }
}
