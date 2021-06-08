O(1) time and O(n) space approach:

class GfG{
    
    Stack<Integer> min=new Stack<>();
    
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.push(a);
	    if(min.isEmpty())
	        min.push(a);
	    else
	    {
	        if(min.peek()>a)
	            min.push(a);
	    }
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            int t=s.pop();
            if(t==min.peek())
                min.pop();
            return t;
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           return min.peek();
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           return s.size()==n ? true :false;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           return s.isEmpty();
	}
	
}

O(1) time and O(1) space approach:

class GfG{
    int min=0;
    public void push(int a,Stack<Integer> s)
	{
		if(s.isEmpty())
		{
		s.push(a);
		min=a;
		}
		else
		{
		if(a>=min)
		    s.push(a);
		else
		{
		 s.push(2*a-min);
		 min=a;
		}
		}
	}
	public int pop(Stack<Integer> s)
 	{
		if(s.size()==0)
		    return -1;

		int a=s.pop();
		if(a>=min)
		    return a;
		    
		int temp=min;
		min=2*temp-a;
		return temp;
	}

	public int min(Stack<Integer> s)
    	{
        	return min;
    	}
	public boolean isFull(Stack<Integer>s, int n)
    	{
	    	if(s.size()==n)
	        	return true;
	    	else
	        	return false;
	}
	public boolean isEmpty(Stack<Integer>s)
    	{
            	if(s.size()==0)
               		return true;
            	else
                	return false;
	}
}
