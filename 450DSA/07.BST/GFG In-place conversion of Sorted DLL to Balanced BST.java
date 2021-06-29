class Node
{
	int data;
	Node next, prev;

	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}

class LinkedList
{
	Node head;

	Node sortedListToBST()
	{
		/*Count the number of nodes in Linked List */
		int n = countNodes(head);

		/* Construct BST */
		return sortedListToBSTRecur(n);
	}

	Node sortedListToBSTRecur(int n)
	{
		/* Base Case */
		if (n <= 0)
			return null;

		Node left = sortedListToBSTRecur(n / 2);

		Node root = head;

		root.prev = left;

		head = head.next;

		root.next = sortedListToBSTRecur(n - n / 2 - 1);

		return root;
	}

	int countNodes(Node head)
	{
		int count = 0;
		Node temp = head;
		while (temp != null)
		{
			temp = temp.next;
			count++;
		}
		return count;
	}

	void push(int new_data)
	{
		/* allocate node */
		Node new_node = new Node(new_data);

		new_node.prev = null;

		new_node.next = head;

		if (head != null)
			head.prev = new_node;

		head = new_node;
	}

	void printList()
	{
		Node node = head;
		while (node != null)
		{
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	void preOrder(Node node)
	{
		if (node == null)
			return;
		System.out.print(node.data + " ");
		preOrder(node.prev);
		preOrder(node.next);
	}

	/* Drier program to test above functions */
	public static void main(String[] args)
	{
		LinkedList llist = new LinkedList();

		/* Let us create a sorted linked list to test the functions
		Created linked list will be 7->6->5->4->3->2->1 */
		llist.push(7);
		llist.push(6);
		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);

		System.out.println("Given Linked List ");
		llist.printList();

		Node root = llist.sortedListToBST();
		System.out.println("");
		System.out.println("Pre-Order Traversal of constructed BST ");
		llist.preOrder(root);
	}
}

