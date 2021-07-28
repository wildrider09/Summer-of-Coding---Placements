/*
Given a directed graph and a source node and destination node, we need to find how many edges we need to reverse in order to make at least 1 path from source node to destination node.

Examples:  

1.Modify the graph in such a way that, if we move towards original edge, then weight for that edge = 0
2.But if we move toward reverse edge, then weight of that edge = 1 cost is added. 
3.If we apply Dijkstra’s shortest path on this modified graph from given source, then that will give us minimum cost to reach from source to destination i.e. minimum edge reversal from source to destination. 

Below is the code based on above concept. 
https://ide.geeksforgeeks.org/GmK9n6qrX6
*/

import java.util.*;

public class Solution {
    public static int reverseEdges(int n, int S, int E, int [][]edgeList) {
    
        int adj[][]=new int[n][n];
        int dist[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<int[]> q=new PriorityQueue<>(1,(a,b)->a[1]-b[1]);
        for(int i=0;i<n;i++)
            Arrays.fill(adj[i],-1);
        
        for(int i=0;i<edgeList.length;i++)
        {
            int x=edgeList[i][0];
            int y=edgeList[i][1];
            adj[x][y]=0;
            adj[y][x]=1;
        }
        
        dist[S]=0;
        q.add(new int[]{S,dist[S]});
        
        while(!q.isEmpty())
        {
            int t[]=q.poll();
            int u=t[0],wt=t[1];
            
            for(int v=0;v<n;v++)
            {
                if(adj[u][v]==-1)	continue;
                
                int edge=adj[u][v];
                if(dist[v]>wt+edge)
                {
                    dist[v]=wt+edge;
                    q.add(new int[]{v,dist[v]});
                }
            }
        }
        return dist[E];
    }
    
    public static void main(String args[])
    {
        int V = 7;
        int edge[][] = { { 0, 1 }, { 2, 1 },
                         { 2, 3 }, { 5, 1 },
                         { 4, 5 }, { 6, 4 },
                         { 6, 3 } };
        int E = edge.length;
 
        int minEdgeToReverse = reverseEdges(V,0,6,edge);
     
        if (minEdgeToReverse != -1)
            System.out.println(minEdgeToReverse);
        else
            System.out.println("Not possible");
    }
}
