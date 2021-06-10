class GFG {

	static class Node {
		int data;
		Node next;
	};

	static Node push(Node head_ref, int data)
	{
		Node ptr1 = new Node();
		ptr1.data = data;
		ptr1.next = head_ref;

		if (head_ref != null) {

			Node temp = head_ref;
			while (temp.next != head_ref)
				temp = temp.next;
			temp.next = ptr1;
		}
		else
			ptr1.next = ptr1; /*For the first node */

		head_ref = ptr1;
		return head_ref;
	}

	static void printList(Node head)
	{
		Node temp = head;
		if (head != null) {
			do {
				System.out.printf("%d ", temp.data);
				temp = temp.next;
			} while (temp != head);
		}

		System.out.printf("\n");
	}

	static Node deleteNode(Node head, int key)
	{
		if (head == null)
			return null;
			
		if(head.data==key)
		{
		        Node t=head;
		        while(t.next!=head)
		            t=t.next;
		            
		        t.next=head.next;
		        head=head.next;
		        return head;
		  }
		    
		Node t=head.next,prev=head;
		
		while(t!=head && t.data!=key){
		    prev=t;
		    t=t.next;
		}
		
		if(t.data==key)
		   prev.next=t.next;
		
		
		return head;
		    
	}

	/* Driver code */
	public static void main(String args[])
	{
		Node head = null;

		head = push(head, 2);
		head = push(head, 5);
		head = push(head, 7);
		head = push(head, 8);
		head = push(head, 10);

		System.out.printf("List Before Deletion: ");
		printList(head);

		head= deleteNode(head, 7);
        System.out.printf("List After Deletion: ");
		printList(head);
		
		head = deleteNode(head, 2);
		System.out.printf("List After Deletion: ");
		printList(head);

		head = deleteNode(head, 10);
		System.out.printf("List After Deletion: ");
		printList(head);
		
		head = deleteNode(head, 8);
    	System.out.printf("List After Deletion: ");
		printList(head);
	}
}

