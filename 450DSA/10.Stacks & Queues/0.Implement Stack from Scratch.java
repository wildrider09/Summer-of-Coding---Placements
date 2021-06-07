public class MyStack {
   private int maxSize;
   private int[] stack;
   private int top;
   
   public MyStack(int s) {
       maxSize=10;
       stack=new int[s];
       top=-1;
   }
   public void push(int j) {
        if(top==maxSize-1)
            System.out.println("Stack Overflow");
        else
            stack[++top]=j;
   }
   public int pop() {
       if(top==-1)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        else
            return stack[top--];
   }
   public int peek() {
       
       if(top==-1)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        else
            return stack[top];
   }
   public boolean isEmpty() {
      
        return top==-1 ? true : false;
        
   }
   public boolean isFull() {
       
       return top==maxSize-1 ? true : false;
   }
   public static void main(String[] args) {
      MyStack theStack = new MyStack(10); 
      theStack.push(10);
      theStack.push(20);
      theStack.push(30);
      theStack.push(40);
      theStack.push(50);
      theStack.push(10);
      theStack.push(20);
      theStack.push(30);
      theStack.push(40);
      theStack.push(50);
      theStack.push(50);
      int value = theStack.peek();
      System.out.println(value);
        
      while (!theStack.isEmpty())
      {
         value = theStack.pop();
         System.out.println(value);
        
      }
      value = theStack.peek();
      System.out.println(value);
   }
}
