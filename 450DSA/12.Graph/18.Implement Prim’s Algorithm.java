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
        int w=0,t=0,x=0,y=0,sum=Integer.MAX_VALUE;
        
        for(int i=0;i<adj.size();i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                if(sum>adj.get(i).get(j).get(1))
                {
                    w=i;t=j;
                    x=adj.get(i).get(j).get(0);
                    y=adj.get(i).get(j).get(1);
                    sum=y;
                }
            }
        }
        
        q.add(new Pair(w,x,y));
        adj.get(w).remove(t);
        sum=0;
        
        for(int i=0;i<V;i++)
            parent[i]=i;
            
        
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
            
            while(adj.get(p.v1).size()>0)
            {
                x=adj.get(p.v1).get(0).get(0);
                y=adj.get(p.v1).get(0).get(1);
                q.add(new Pair(p.v1,x,y));
                
                adj.get(p.v1).remove(0);
            }
            
            while(adj.get(p.v2).size()>0)
            {
                x=adj.get(p.v2).get(0).get(0);
                y=adj.get(p.v2).get(0).get(1);
                q.add(new Pair(p.v2,x,y));
                
                adj.get(p.v2).remove(0);
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

