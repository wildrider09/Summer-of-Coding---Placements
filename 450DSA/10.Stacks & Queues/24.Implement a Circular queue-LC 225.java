class MyCircularQueue {
    
    int front;
    int rear;
    int n;
    int queue[];

    public MyCircularQueue(int k) {
        
        front=0;
        rear=-1;
        n=k;
        queue=new int[n];
    }
    
    public boolean enQueue(int value) {
        
        if(isFull())
            return false;
        
        rear=(rear+1)%n;
        queue[rear]=value;
        return true;
    }
    
    public boolean deQueue() {
        
        if(isEmpty())
            return false;
        
        if(front==rear)
        { front=0; rear=-1;}
        else
        {front=(front+1)%n;}
        return true;
    }
    
    public int Front() {

        if(isEmpty())
            return -1;
        else
            return queue[front];
        
    }
    
    public int Rear() {
        
        if(isEmpty())
            return -1;
        else
            return queue[rear];
    }
    
    public boolean isEmpty() {
        
       return front==0 && rear==-1  ? true : false;
    }
    
    public boolean isFull() {
        
       return rear!=-1 && (rear+1)%n == front ? true :false;
    }
}

