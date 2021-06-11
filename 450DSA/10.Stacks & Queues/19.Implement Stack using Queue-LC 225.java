class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
    
    public MyStack() {
        
        q1=new LinkedList<Integer>();
        q2=new LinkedList<Integer>();

    }
    
    public void push(int x) {   //push O(n)
        
        q2.add(x);
        
 	    while(!q1.isEmpty())
 	        q2.add(q1.remove());  
	        
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
    }
    
    public int pop() {
        
        if(q1.isEmpty())
            return -1;
        return q1.remove();
    }
    
    public int top() {
        
         if(q1.isEmpty())
            return -1;
        return q1.peek();
    }
    
    public boolean empty() {
        
        return q1.isEmpty();
    }
}

