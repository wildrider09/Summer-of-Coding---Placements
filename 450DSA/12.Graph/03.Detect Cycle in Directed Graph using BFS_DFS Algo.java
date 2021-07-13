//BFS
class Solution 
{
    //Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
    {

        Deque<Integer> q=new ArrayDeque<>();
        int visited[]=new int[V];
        int p=0;
        
        for(int i=0;i<V;i++)
            for(int j:adj.get(i))
                visited[j]++;
        
        for(int i=0;i<V;i++)
        {
            if(visited[i]==0)
                q.addFirst(i);
        }
         
        while(!q.isEmpty())
        {
            int t=q.poll();
            p++;
            visited[t]=-1;
            
            for(int j=0;j<adj.get(t).size();j++)
            {
                visited[adj.get(t).get(j)]--;
                if(visited[adj.get(t).get(j)]==0)
                    q.add(adj.get(t).get(j));
            }
        }
        
        if(p<V)
            return true;
        
        return false;
        
    }
}

//DFS
class Solution 
{
    //Function to detect cycle in a directed graph.
    boolean flag;
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
    {

        flag=false;
        boolean visited[]=new boolean[V];
        boolean arr[]=new boolean[V];
        
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
                Dfs(i,adj,visited,arr);
        }
 
        return flag;
    }
    
    void Dfs(int pos,ArrayList<ArrayList<Integer>> adj,boolean visited[],boolean[] arr)
    {
        visited[pos]=true;
        arr[pos]=true;
        
        for(int i=0;i<adj.get(pos).size();i++)
        {
            if(visited[adj.get(pos).get(i)]==false)
                Dfs(adj.get(pos).get(i),adj,visited,arr);
                
            else if(visited[adj.get(pos).get(i)] && arr[adj.get(pos).get(i)])
                flag=true;
        }
        
        arr[pos]=false;
    }
    
}

