class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        long ans=0;
        PriorityQueue<Long> q=new PriorityQueue<>();
        for(long i:arr)
            q.add(i);
            
            
        while(q.size()>1)
        {
            long a1=q.remove();
            long a2=q.remove();
            ans+=a1+a2;
            q.add(a1+a2);
        }
        
        return ans;
    }
}
