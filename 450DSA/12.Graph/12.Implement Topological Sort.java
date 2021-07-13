//BFS
class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int res[]=new int[V];
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
	     res[p++]=t;
	     visited[t]=-1;
		
	     for(int j=0;j<adj.get(t).size();j++)
	     {
	        visited[adj.get(t).get(j)]--;
		   if(visited[adj.get(t).get(j)]==0)
		      q.add(adj.get(t).get(j));
	     }
	 }
       
        
        return res;
    }
}

//DFS
class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        ArrayList<Integer> list=new ArrayList<>();
        boolean visited[]=new boolean[V];
        int arr[]=new int[V];
        
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
                Dfs(i,adj,visited,list);
        }
 
        for(int i=V-1;i>=0;i--)
            arr[V-i-1]=list.get(i);
  
        return arr;
    }
    
    static void Dfs(int pos,ArrayList<ArrayList<Integer>> adj,boolean visited[],ArrayList<Integer> list)
    {
        visited[pos]=true;
 
        for(int i=0;i<adj.get(pos).size();i++)
        {
            if(visited[adj.get(pos).get(i)]==false)
                Dfs(adj.get(pos).get(i),adj,visited,list);
        }
        
        list.add(pos);
    }
}



