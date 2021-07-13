//BFS
class Solution {
    public int makeConnected(int n, int[][] connections) {
        
        if(n-1>connections.length)
            return -1;
        
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(i,new ArrayList<Integer>());
        
        for(int arr[]:connections){
            
            adj.get(arr[0]).add(arr[1]);
            adj.get(arr[1]).add(arr[0]);
        }
         
        int p=0;
        Deque<Integer> q=new ArrayDeque<>();
        boolean[] visited=new boolean[n];
        
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                ++p;
                q.add(i);
                visited[i]=true;
                
                while(!q.isEmpty())
                {
                    int t=q.poll();
                    for(int k=0;k<adj.get(t).size();k++)
                    {
                        if(!visited[adj.get(t).get(k)])
                        {
                            visited[adj.get(t).get(k)]=true;
                            q.add(adj.get(t).get(k));
                        }
                    }
                }
            }
        }
        
        return p-1; 
    }
}

//Union Set
class Solution {
    public int makeConnected(int n, int[][] connections) {
        
        if(n-1>connections.length)
            return -1;
        
        int vertex[]=new int[n];
        int p=0;
        
        for(int i=0;i<n;i++)
            vertex[i]=i;
        
        for(int arr[]:connections)
        {    
            int v1=arr[0],v2=arr[1];
            int p1=parent(vertex,v1),p2=parent(vertex,v2);
            
            if(p1!=p2)
            {
                vertex[p2]=p1;
            }
        }
         
        for(int i=0;i<n;i++)
            if(vertex[i]==i)
                p++;
        
        return p-1; 
    }
    
    public int parent(int vertex[],int pos)
    {
        if(vertex[pos]==pos)
            return pos;
        
        return parent(vertex,vertex[pos]);
    }
}

