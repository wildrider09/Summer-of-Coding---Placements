class Solution
{
    //Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean visited[]=new boolean[V];
        ArrayList<Integer> list=new ArrayList<>();
        Deque<Integer> q=new ArrayDeque<>();
    
        visited[0]=true;
        list.add(0);
        q.addLast(0);
        
        while(!q.isEmpty())
        {
            int t=q.poll();
            
            for(int i=0;i<adj.get(t).size();i++)
            {
                if(!visited[adj.get(t).get(i)])
                {
                    visited[adj.get(t).get(i)]=true;
                    list.add(adj.get(t).get(i));
                    q.addLast(adj.get(t).get(i));
                }
            }
        }
        
        return list;
    }
}

class Solution
{
    //Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        ArrayList<Integer> list=new ArrayList<>();
        boolean visited[]=new boolean[V];
        Deque<Integer> q=new ArrayDeque<>();
        
        q.addLast(0);
        
        while(!q.isEmpty())
        {
            int t=q.poll();
            if(!visited[t])
            {
                list.add(t);
             
                visited[t]=true;
                for(int i=0;i<adj.get(t).size();i++)
                    q.addLast(adj.get(t).get(i));
            }
        }
        
        return list;
    }
}
