class GfG
{
    //Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
      //add code here.
        int n=q.size(),t=k;
        Stack<Integer> st=new Stack<>();
        while(t-- > 0)
            st.push(q.remove());
        
        while(!st.isEmpty())
            q.add(st.pop());
        
        for(int i=0;i<n-k;i++)
            q.add(q.remove());
            
        return q;
    }
}


class GfG
{
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
        int p=q.size()-k;
        q=reverse(q,k);
        while(!q.isEmpty() && p-->0)
            q.add(q.remove());
            
            return q;
        
    }
    
    public Queue<Integer> reverse(Queue<Integer> q, int k){
        
        if(k>0 && !q.isEmpty()){
            int a=q.remove();
            reverse(q,k-1);
            q.add(a);
        }
        return q;
    }
    
}


