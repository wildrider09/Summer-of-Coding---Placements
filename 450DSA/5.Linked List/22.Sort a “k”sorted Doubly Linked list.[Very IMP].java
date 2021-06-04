import java.util.*;
class DoublyLinkedList
{
    class Compare implements Comparator<Node>
    {
        public int compare(Node n1,Node n2)
        {
            return n1.data-n2.data;
        }
    }
    
    static Node head;
    static class Node
    {
    	int data;
    	Node next, prev;
    	Node(int d)
    	{
    	data = d;
    	next = prev = null;
    	}
    }
    
    Node sortAKSortedDLL( Node head, int k) {
        
         if(head==null || head.next==null)
             return head;
            
         Node result=new Node(0);
         Node resulttemp=result;
        
         PriorityQueue<Node> heap=new PriorityQueue<Node>(1,new Compare());
        
        while(k-->=0 && head!=null)    
        {
            heap.add(head);
            head=head.next;
    	}
    
      	 while(!heap.isEmpty())
         {
            
            resulttemp.next=heap.poll();
            System.out.print(resulttemp.next.data);
    	    resulttemp.next.prev=resulttemp;
    	    resulttemp=resulttemp.next;
    	    
    	    if(head!=null){
    	       heap.add(head);
                head=head.next;
    	    }
    	 }
         resulttemp.next=null;    	 
         result.next.prev=null;
         return result.next; 
    }
    
    void push(int new_data)
    {
    	Node new_node = new Node(new_data);
    	new_node.prev = null;
    	new_node.next = head;
    	if (head != null)
    	{
    	head.prev = new_node;
    	}
    
    	head = new_node;
    }
    
    void printList(Node node)
    {
    	while (node != null)
    	{
    	System.out.print(node.data + " ");
    	node = node.next;
    	}
    }
    
    public static void main(String[] args)
    {
    	DoublyLinkedList list = new DoublyLinkedList();
    
    	list.push(8);
    	list.push(56);
    	list.push(12);
    	list.push(2);
    	list.push(6);
    	list.push(3);
    
    	int k = 2;
    
    	System.out.println("Original Doubly linked list:");
    	list.printList(head);
    
    	Node sortedDLL = list.sortAKSortedDLL(head, k);
    	System.out.println("");
    	System.out.println("Doubly Linked List after sorting:");
    	list.printList(sortedDLL);
    }
}
