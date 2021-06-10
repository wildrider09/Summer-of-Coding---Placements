import java.util.*;

public class Solution 
{
	public static void interLeaveQueue(Queue<Integer> q)
    {
        
        Stack<Integer> st=new Stack<>();
        
    	int halfSize =(int) Math.ceil(q.size() / 2.0);
    	int half=q.size()/2;
    	
    	insertstack(q,st,halfSize);
    	
    	for(int i=1;i<=halfSize;i++)
    	    q.add(st.pop());
        
        for(int i=1;i<=half;i++)
    	    q.add(q.remove());
        
        insertstack(q,st,halfSize);
    	
    	while(half-->0)
    	{
    	    q.add(st.pop());
    	    q.add(q.remove());
    	}
    	
    	if(!st.isEmpty())
    	    q.add(st.pop());
    }
    static void insertstack(Queue<Integer>q,Stack<Integer>st,int k)
    {
        while(k-->0)
            st.push(q.remove());
        
    }
}
