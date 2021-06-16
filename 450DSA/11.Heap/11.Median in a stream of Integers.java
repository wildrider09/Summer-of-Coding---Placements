class Solution
{
    static PriorityQueue<Integer> min=new PriorityQueue<>(1);
    static PriorityQueue<Integer> max=new PriorityQueue<>(1,(a,b)->b-a);
    
    public static void insertHeap(int x)
    {
        if(min.isEmpty() && max.isEmpty())
            min.add(x);
            
        else if(!min.isEmpty())
        {
            if(x>min.peek())
                min.add(x);
            else
                max.add(x);
        }
        
        else if(!max.isEmpty())
        {
            if(x<max.peek())
                max.add(x);
            else
                min.add(x);
        }
        balanceHeaps();
        
    }
    
    public static void balanceHeaps()
    {
        int t=max.size()-min.size();
        
        if(Math.abs(t)<=1)
            return ;
        
        else if(t>1)
            min.add(max.remove());            
        
        else if(t<-1)
            max.add(min.remove());
    }
    
    public static double getMedian()
    {
        if(min.size()==max.size())
            return (min.peek()+max.peek())/2.0;
        
        else if(min.size()>max.size())
            return min.peek();
        
        else
            return max.peek();
    }
    
}
