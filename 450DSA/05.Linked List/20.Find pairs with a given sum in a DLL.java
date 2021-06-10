
class GFG
{
static class Node
{
	int data;
	Node next, prev;
};

static void pairSum( Node head, int x)
{
    Node root=head,end=head;
    while(end.next!=null)
        end=end.next;
    
    while(root!=end)
    {
        int sum=root.data+end.data;
        if(sum==x)
           {
               System.out.println("("+ end.data +"," + root.data +")");
               root=root.next;
               end=end.prev;
           }
        else if(sum>x)
            end=end.prev;
        else
            root=root.next;
    }
}

static Node insert(Node head, int data)
{
	Node temp = new Node();
	temp.data = data;
	temp.next = temp.prev = null;
	if (head == null)
		(head) = temp;
	else
	{
		temp.next = head;
		(head).prev = temp;
		(head) = temp;
	}
	return temp;
}

public static void main(String args[])
{
	Node head = null;
	head = insert(head, 9);
	head = insert(head, 8);
	head = insert(head, 7);
	head = insert(head, 6);
	head = insert(head, 5);
	head = insert(head, 5);
	head = insert(head, 4);
	head = insert(head, 2);
	head = insert(head, 2);
	head = insert(head, 1);
	int x = 7;

	pairSum(head, x);
}
}

