//This quesn reduces to "Checking cycle in an undirected graph"

//BFS
class Solution
{
    //Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean visited[]=new boolean[V];
        int parent[]=new int[V];
        Arrays.fill(parent,-1);
        Deque<Integer> q=new ArrayDeque<>();
        
        for(int k=0;k<V;k++)
        {
            if(visited[k]==false)
            {
                q.addLast(k);
                visited[k]=true;
        
                while(!q.isEmpty())
                {
                    int t=q.poll();
                
                    for(int i=0;i<adj.get(t).size();i++)
                    {    
                        int pos=adj.get(t).get(i);
                        if(!visited[pos])
                        {
                            visited[pos]=true;
                            parent[pos]=t;
                            q.addLast(pos);
                        }
                         
                        else if(visited[pos] && pos!=parent[t])
                            return true;
                    }
                }
            }
        }
        return false;
    }
}

//DFS
class Solution
{
    //Function to detect cycle in an undirected graph.
    boolean flag;
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean visited[]=new boolean[V];
        flag=false;
        
        for(int k=0;k<V;k++)
        {
            if(visited[k]==false)
                Dfs(k,adj,visited,-1);
        }   
        
        return flag;
    }
    
    void Dfs(int pos,ArrayList<ArrayList<Integer>> adj,boolean visited[],int parent)
    {
        visited[pos]=true;
        for(int i=0;i<adj.get(pos).size();i++)
        {
            if(visited[adj.get(pos).get(i)]==false)
                Dfs(adj.get(pos).get(i),adj,visited,pos);
            
            else if(visited[adj.get(pos).get(i)] && adj.get(pos).get(i)!=parent)
                flag=true;
        }
        
    }
}

