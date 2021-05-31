class LinkedList
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}

	void moveToFront()
	{
		if(head == null || head.next == null)
			return;
		
		Node temp=head;
		Node prev=null;
		
		while(temp.next!=null)
		{
    		prev=temp;
    		temp=temp.next;
		}
		prev.next=null;
		temp.next=head;
		head=temp;
	
		

	}				

					
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
    	head = new_node;
	}

	void printList()
	{
		Node temp = head;
		while(temp != null)
		{
		System.out.print(temp.data+" ");
		temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[])
	{
		LinkedList llist = new LinkedList();
		/* Constructed Linked List is 1->2->3->4->5->null */
		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);
		
		System.out.println("Linked List before moving last to front ");
		llist.printList();
		
		llist.moveToFront();
		
		System.out.println("Linked List after moving last to front ");
		llist.printList();
	}
}
