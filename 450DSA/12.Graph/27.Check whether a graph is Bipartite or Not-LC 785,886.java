class Solution
{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>G)
    {
        int[] color=new int[V];
        
        for(int i=0;i<V;i++)
        {
            if(color[i]==0)
            {
                color[i]=1;
                if(checkDfs(G,color,i)==false)
                    return false;
            }
        }
        
        return true;
    }
    
    boolean checkDfs(ArrayList<ArrayList<Integer>> G, int[] color, int index)
    {
        for(int i=0;i<G.get(index).size();i++)
        { 
            int pos=G.get(index).get(i);
            
            if(color[pos]==0)
            {
                color[pos]= color[index]==1 ? 2 : 1;
                if(checkDfs(G,color,pos)==false)
                    return false;
            }
            
            else if(color[pos]==color[index])
                return false;
        }  
        return true;
    }
}

//LeetCode Quesn 785
class Solution {
    public boolean isBipartite(int[][] arr) {
        
        int V=arr.length;
        int[] color=new int[V];
        
        for(int i=0;i<V;i++)
        {
            if(color[i]==0)
            {
                color[i]=1;
                if(checkDfs(arr,color,i)==false)
                    return false;
            }
        }
        
        return true;
    }
    
    boolean checkDfs(int[][] G, int[] color, int index)
    {
        for(int i=0;i<G[index].length;i++)
        { 
            int pos=G[index][i];
            
            if(color[pos]==0)
            {
                color[pos]= color[index]==1 ? 2 : 1;
                if(checkDfs(G,color,pos)==false)
                    return false;
            }
            
            else if(color[pos]==color[index])
                return false;
        }
        return true;
    }
}

//LeetCode Quesn 886
class Solution {
    public boolean possibleBipartition(int n, int[][] arr) {
        
        int[] color=new int[n];
        ArrayList<ArrayList<Integer>> G=new ArrayList<>();
        
        for(int i=0;i<n;i++)
            G.add(new ArrayList<>());
        
        for(int i=0;i<arr.length;i++)
        {
            G.get(arr[i][0]-1).add(arr[i][1]-1);
            G.get(arr[i][1]-1).add(arr[i][0]-1);
        }
                         
        
        for(int i=0;i<n;i++)
        {
            if(color[i]==0)
            {
                color[i]=1;
                if(checkDfs(G,color,i)==false)
                    return false;
            }
        }
        
        return true;
    }
    
    boolean checkDfs(ArrayList<ArrayList<Integer>> G, int[] color, int index)
    {
        for(int i=0;i<G.get(index).size();i++)
        { 
            int pos=G.get(index).get(i);
            
            if(color[pos]==0)
            {
                color[pos]= color[index]==1 ? 2 : 1;
                if(checkDfs(G,color,pos)==false)
                    return false;
            }
            
            else if(color[pos]==color[index])
                return false;
    
        }
        
        return true;
    }
}
