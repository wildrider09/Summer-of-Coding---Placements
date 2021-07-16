class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        int dist[]=new int[V];
        PriorityQueue<int[]> q=new PriorityQueue<>(1,(a,b)->a[1]-b[1]);
        
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[S]=0;
        q.add(new int[]{S,dist[S]});
        
        while(!q.isEmpty())
        {
            int t[]=q.poll();
            int v1=t[0],w1=t[1];
            for(int i=0;i<adj.get(v1).size();i++)
            {
                int v2=adj.get(v1).get(i).get(0);
                int edge=adj.get(v1).get(i).get(1);
                
                if(dist[v2]>w1+edge)
                {
                    dist[v2]=w1+edge;
                    q.add(new int[]{v2,dist[v2]});
                }
            }
        }
        
        return dist;
    }
}
