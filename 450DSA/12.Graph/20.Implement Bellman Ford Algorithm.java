
class Solution
{
    public int isNegativeWeightCycle(int n, int[][] edges)
    {
        //code here
        int dist[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<edges.length;j++)
            {
                int v1=edges[j][0];
                int v2=edges[j][1];
                int wt=edges[j][2];
                
                if(dist[v1]!=Integer.MAX_VALUE && dist[v1]+wt<dist[v2])
                {
                    dist[v2]=wt+dist[v1];
                    if(i==n-1)
                        return 1;
                }
            }
        }
        
        return 0;
    }
}
