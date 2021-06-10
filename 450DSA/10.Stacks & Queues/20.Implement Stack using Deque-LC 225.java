import java.util.*;
class MyStack {
    
    Deque<Integer> deque; 
    public MyStack() {
        deque= new LinkedList<Integer>();
    }
    
    public void push(int x) {
     
        deque.addLast(x);
    }
    
    public int pop() {
        
        if(deque.isEmpty())
            return -1; 
        
       return deque.removeLast();
    }
    
    public int top() {
        
        if(deque.isEmpty())
            return -1;
        else
            return deque.peekLast();
    }
    
    public boolean empty() {
        
        return deque.isEmpty();
    }
}

