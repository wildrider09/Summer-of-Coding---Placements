class Solution
{
    //Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean visited[]=new boolean[V];
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        dfs(0,visited,list,adj);
        
        return list;
    }
    
    void dfs(int pos,boolean visited[],ArrayList<Integer> list,ArrayList<ArrayList<Integer>> adj)
    {
        visited[pos]=true;
        list.add(pos);
        for(int i=0;i<adj.get(pos).size();i++)
        {
            if(visited[adj.get(pos).get(i)]!=true)
                dfs(adj.get(pos).get(i),visited,list,adj);
        }
    }
    
}
