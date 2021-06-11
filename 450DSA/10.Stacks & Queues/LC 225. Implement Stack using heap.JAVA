class MyStack {

    PriorityQueue<int[]> q1;
    int count;
    
    public MyStack() {
        
        q1=new PriorityQueue<>(1,(a,b)->b[0]-a[0]);
        count=0;
    }
    
    public void push(int x) {   //push O(n)
        
        count++;
        q1.add(new int[]{count,x});
    }
    
    public int pop() {
        
        if(q1.isEmpty())
            return -1;
        
        return q1.remove()[1];
    }
    
    public int top() {
        
         if(q1.isEmpty())
            return -1;
        return q1.peek()[1];
    }
    
    public boolean empty() {
        
        return q1.isEmpty();
    }
}

