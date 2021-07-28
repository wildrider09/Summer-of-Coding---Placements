class Solution
{
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int v, ArrayList<ArrayList<Integer>> adj)
    {
        int count=0;
        boolean visited1[]=new boolean[v];
        boolean visited2[]=new boolean[v];
        Stack<Integer> st=new Stack<>();
        ArrayList<ArrayList<Integer>> rev=new ArrayList<>();
        for(int i=0;i<v;i++)
            rev.add(new ArrayList<>());
    
        for(int i=0;i<v;i++)
        {
            if(visited1[i]==false)
                DFS(adj,i,st,visited1);   
        }
        
        reverse(adj,rev);
        
        while(!st.isEmpty())
        {
            int temp=st.pop();
            if(visited2[temp]==false)
            {
                DFS2(rev,temp,visited2);
                count++;
            }
        }
        return count;
    }
    
    void DFS(ArrayList<ArrayList<Integer>> adj,int index,Stack<Integer> st,
             boolean visited[])
    {
        visited[index]=true;
        
        for(int i=0;i<adj.get(index).size();i++)
        {
            if(visited[adj.get(index).get(i)]==false)
        
                DFS(adj,adj.get(index).get(i),st,visited);
        }
        st.add(index);
    }
    
    void reverse(ArrayList<ArrayList<Integer>> adj,ArrayList<ArrayList<Integer>> rev)
    {
        for(int i=0;i<adj.size();i++)
        {
            for(int j:adj.get(i))
            
                rev.get(j).add(i);
        }
    }
    
    void DFS2(ArrayList<ArrayList<Integer>> rev,int index,boolean visited[])
    {
        visited[index]=true;
        
        for(int i=0;i<rev.get(index).size();i++)
        {
            if(visited[rev.get(index).get(i)]==false)
        
                DFS2(rev,rev.get(index).get(i),visited);
        }
    }
    
}

