//DjiKrstra
class Holder
{
    int val, dist, stops;
    Holder(int v, int d, int k)
    { 
        this.val = v; this.dist = d; this.stops = k;
    }
}

class Solution
{
    public int findCheapestPrice(int n, int[][] flights, int src, int dest, int k) 
    {
        Deque<Holder> q = new LinkedList<>();
        int[] visited = new int[n];
        int[][] g = new int[n][n];
        Arrays.fill(visited, Integer.MAX_VALUE);
        
        for(int i =0; i < flights.length; i++)
            g[flights[i][0]][flights[i][1]] = flights[i][2];
        

        visited[src] = 0;
        q.addLast(new Holder(src, 0, 0)); 

        while(q.size()!=0)
        {
            Holder c = q.removeFirst();
            for(int i =0; i < n; i++)
            {
                if(g[c.val][i] != 0 && c.stops <= k && visited[i] > c.dist + g[c.val][i])
                {
                    visited[i] = c.dist+g[c.val][i];
                    q.addLast(new Holder(i, visited[i], c.stops+1));
                }
            }
        }
        
        return visited[dest]==Integer.MAX_VALUE ? -1 : visited[dest];
    }
}

//Bellman Ford
class Solution {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        int[] path = new int[n];
        Arrays.fill(path, Integer.MAX_VALUE);
        path[src] = 0;
        
        for(int i = 0; i<=k; i++)
        {
            int temp[] = path.clone(); 
            
            for(int j = 0; j<flights.length; j++)
            {
                int u = flights[j][0];
                int v = flights[j][1];
                int wt = flights[j][2];
                
                if(path[u] != Integer.MAX_VALUE)
                    temp[v] = Math.min(temp[v], path[u] + wt);
                
            }
            
            path = temp;
        }
        
        return path[dst] == Integer.MAX_VALUE ? -1 : path[dst];
        
    }
}


