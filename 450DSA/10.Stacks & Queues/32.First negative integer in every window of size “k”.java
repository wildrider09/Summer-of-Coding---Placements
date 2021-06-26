class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int n, int k)
    {
        
        Queue<Long> q = new LinkedList<Long>();
        long ans[]=new long[n-k+1];
        int t=0;
        for(int i=0;i<=n-k;i++)
        {
            int count=k;
          
            if(q.isEmpty())
            {   
                t=i;
                while(count-->0 && t<n )
                {
                    if(A[t]<0)
                        q.add(A[t]);
                    
                    t++;
                }
            }
            else if(A[i+k-1]<0)
                q.add(A[i+k-1]);
            
            if(!q.isEmpty())
            {
                ans[i]=q.peek();
                if(q.peek()==A[i])
                    q.remove();
            }
        }
        return ans;
    }
}
