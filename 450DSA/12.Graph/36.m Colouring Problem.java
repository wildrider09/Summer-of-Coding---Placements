class solve 
{
    public static boolean graphColoring(List<Integer>[] G, int[] ans, int useless, int C) 
    {
        Arrays.fill(ans,-1);

        return DFS(G,G.length,ans,0,C);
    }
    
    static boolean DFS(List<Integer>[] G,int n,int []ans,int index,int m)
    {
        if(index==n)
            return true;
        
        for(int i=0;i<m;i++)
        {
            if(isValid(G,ans,index,i))
            {
                ans[index]=i;
                
                if(DFS(G,n,ans,index+1,m))
                    return true;
                
                ans[index]=-1;
            }
        }

        return false; 
    }
    
    static boolean isValid(List<Integer>[] G,int ans[],int index,int color)
    {
        for(int k=0;k<G[index].size();k++)
        {
            if(ans[G[index].get(k)]==color)
                return false;
        }
        
        return true;
    }
}

