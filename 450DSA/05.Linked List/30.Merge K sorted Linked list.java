class Compare implements Comparator<Node> 
{
	public int compare (Node node1, Node node2)
	{
			return node1.data - node2.data;
    	}
}

class Solution
{
    Node mergeKList(Node[]lists,int K)
    {	
	if (lists.length == 1)	return lists[0];
	Node result = new Node(0);      //dummy node
	Node resultIndex = result;
	PriorityQueue<Node> heap = new PriorityQueue<Node>(1, new Compare());
		
        for (int i = 0; i < lists.length; i ++) 
        {
		if (lists[i] != null) 
			heap.add(lists[i]);
	}
	while (heap.isEmpty() == false) 
        {
		resultIndex.next = heap.remove();
		Node head = resultIndex.next.next;
            
		if (head != null)
			heap.add(head);
			
		resultIndex = resultIndex.next;
	}
	return result.next;
    }
 }



class Solution {
     public ListNode mergeKLists(ListNode[] lists) {
        //edge case []
        if (lists.length == 0) return null;
        return partition(lists, 0, lists.length-1);
    }
    
    public ListNode partition(ListNode[] lists, int start, int end) {
        if (start == end) return lists[start];
        
        // start will always be less than or equal to end
        int mid = (start + end) / 2;
        ListNode l1 = partition(lists, start, mid);
        ListNode l2 = partition(lists, mid+1, end);
        return mergeTwo(l1, l2);
    }
    
    public ListNode mergeTwo(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        
        if (l1.val < l2.val) {
            l1.next = mergeTwo(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwo(l1, l2.next);
            return l2;
        }
    }
}

