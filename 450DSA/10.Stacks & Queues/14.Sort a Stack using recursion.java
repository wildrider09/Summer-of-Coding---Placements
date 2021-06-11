class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if(s.isEmpty())
		    return null;
		
		int t=s.pop();
		sort(s);
		insertbottom(s,t);

		return s;
	}
	
	public void insertbottom(Stack<Integer> s,int t)
	{
	    if(s.isEmpty() || t>=s.peek())
	    {
	        s.push(t);
	        return ;
	    }
	    
	    int temp=s.pop();
	    insertbottom(s,t);
	    s.push(temp);
	}
}
