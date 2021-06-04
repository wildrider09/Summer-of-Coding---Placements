import java.io.*;
import java.util.*;

class Node
{
	int data;
	Node prev, next;
	Node(int val)
	{
		data = val;
		prev = null;
		next = null;
	}
}

class GFG
{
	static int countTriplets(Node head, int x)
	{
	    int count=0;
	    Node end=head;
	    
	    while(end.next!=null)
	        end=end.next;
		
		while(head.next!=null)
		{
		    int f=countDouble(head.next,end,x-head.data);
		    if(f>0)    count+=1;
		    head=head.next;
		}
		return count;
	}
	static int countDouble( Node root,Node end, int x)
    {
        int count=0;
        while(root!=end)
        {
            int sum=root.data+end.data;
            if(sum==x){
                   count++;
                   root=root.next;
                   end=end.prev;
                   return count;
               }
            else if(sum>x)
                end=end.prev;
            else
                root=root.next;
        }
        return count;
    }


	static Node insert(Node head, int val)
	{
			// allocate node
			Node temp = new Node(val);

			if (head == null)
				head = temp;

			else
			{
				temp.next = head;
				head.prev = temp;
				head = temp;
			}
		
			return head;
	}

	public static void main(String args[])
	{
			Node head = null;
			head = insert(head, 9);
			head = insert(head, 8);
			head = insert(head, 6);
			head = insert(head, 5);
			head = insert(head, 4);
			head = insert(head, 2);
			head = insert(head, 1);

			int x = 17;
			System.out.println("count = " + countTriplets(head, x));
	}
}

