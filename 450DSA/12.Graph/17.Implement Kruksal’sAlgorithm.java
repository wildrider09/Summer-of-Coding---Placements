class Solution
{
    static class Pair
    {
        int v1,v2,wt;
        Pair(int a,int b,int c)
        {
            v1=a;
            v2=b;
            wt=c;
        }
    }
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        PriorityQueue<Pair> q=new PriorityQueue<>(1,(a,b)->a.wt-b.wt);
        int parent[]=new int[V];
        int sum=0;
        
        for(int i=0;i<V;i++)
            parent[i]=i;
            
        for(int i=0;i<adj.size();i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                int x=adj.get(i).get(j).get(0);
                int y=adj.get(i).get(j).get(1);
                
                q.add(new Pair(i,x,y));
            }
        }
        
        
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            int v1=p.v1,v2=p.v2;
            int p1=findparent(parent,v1),p2=findparent(parent,v2);
            
            if(p1!=p2)
            {
                parent[p2]=p1;
                sum+=p.wt;
            }
        }
        
        return sum; 
    }
    
    static int findparent(int parent[],int pos)
    {
        if(parent[pos]==pos)
            return pos;
        
        return findparent(parent,parent[pos]);
    }
}
