class Solution
{
    //Function to find if the given edge is a bridge in graph.
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        // code here
        int t1=findComponents(V,adj);
        
        removeedge(adj,c,d);
        
        int t2=findComponents(V,adj);
            
        return t1!=t2 ? 1 : 0;
    }
    
    static void removeedge(ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        int pos=0;
        
        for(int i=0;i<adj.get(c).size();i++)
            if(adj.get(c).get(i)==d)
                pos=i;
                
        adj.get(c).remove(pos);
        
        for(int i=0;i<adj.get(d).size();i++)
            if(adj.get(d).get(i)==c)
                pos=i;
        
        adj.get(d).remove(pos);
        
    }
    
    static int findComponents(int V,ArrayList<ArrayList<Integer>> adj)
    {
        
        boolean visited[]=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        int pos=0;
        
        for(int k=0;k<V;k++)
        {
            if(visited[k]==false)
            {
                pos++;
                q.add(k);
                visited[k]=true;
            
                while(!q.isEmpty())
                {
                    int t=q.poll();
                    for(int i=0;i<adj.get(t).size();i++)
                    {
                        if(visited[adj.get(t).get(i)]==false)
                        {
                            visited[adj.get(t).get(i)]=true;
                            q.add(adj.get(t).get(i));
                        }
                    }
                }
            }
        }
        
        return pos;
    }
}
