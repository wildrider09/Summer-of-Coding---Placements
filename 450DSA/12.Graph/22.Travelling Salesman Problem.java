class Solution
{
    public int total_cost(int[][] cost)
    {
        // Code here 
        Queue<Integer> q=new LinkedList<>();
        
        for(int i=1;i<cost.length;i++)
            q.add(i);
        
        return travel(cost,cost.length,q,0);
    }
    
    int travel(int cost[][],int n,Queue<Integer> q,int source) //unique dp calls with source i and set s : dp(i,{Set}) -> (n-1 * 2^(n-2)) calls
    {
        if(q.size()==0)
            return cost[source][0];
        
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<q.size();i++)			 // O(N) to check with vertex to choose next
        {
            int curr=q.poll();
            
            int temp=cost[source][curr]+travel(cost,n,q,curr);
            
            ans=Math.min(ans,temp);
            q.add(curr);
        }
        
        return ans;
    }
}

// unique DP calls : DP(i,{set}) -> (n-1) * (2^(n-2)) 
//space (n   * (2^n))
//time  (n^2 * (2^n))
