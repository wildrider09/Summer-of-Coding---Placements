import java.io.*;
import java.util.*;

class Test
{
	
    public static void pushAtBottom(Stack<Integer> myStack, int x) 
    {
       if(myStack.empty()) 
        {
            myStack.push(x);
            return ;
	}
        
    	int num = myStack.pop();
    	pushAtBottom(myStack, x);
    	myStack.push(num);
    }
    public static void reverse(Stack<Integer> stack)
    {
        if(stack.isEmpty())
            return ;
            
        int t=stack.pop();
        reverse(stack);
        pushAtBottom(stack,t);
        
    }
    
    public static void print(Stack<Integer> stack)
    {
        System.out.println("\nStack: " + stack);
    }
    
	public static void main (String[] args)
	{
		Stack<Integer> stack = new Stack<Integer>();
 	   	stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		print(stack);
		
		reverse(stack);
		
		print(stack);
		
	}
}
